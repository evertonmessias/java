<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.sql.*"%>
<%@ page language="java" import="conexao.Conexao" %>
<%@ page language="java" import="banco.ValidaLogin" %>
<%@ page language="java" import="banco.Consultar" %>
<%@ page language="java" import="banco.Apagar"%>
<%@ page import="java.security.*, mdhash.*"%>

<%
	String botao = request.getParameter("botao");

	if (botao.equals("botaologin")) {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		mdjavahash md = new mdjavahash();
		String senhamd = md.getHashPass(senha);
		ValidaLogin valida = new ValidaLogin();
		if (valida.validar(usuario, senhamd)) {
			session.setAttribute("usuario", usuario); //sessão
			out.print("<script>window.location.href='index.jsp'</script>"); // Redirecionamento js			
		} else {
			out.print("Usuário ou Senha invalidos!!!");
		}
	} else if (botao.equals("botaoapagar")) {
		String idd = request.getParameter("idd");			
		Apagar a = new Apagar();
		int id = Integer.parseInt(idd);
		if(a.apaga(id))			
			out.print("<script>window.location.href='index.jsp?p=apagar'</script>");
		//else out.print("ERRO AO APAGAR!");
	}
%>