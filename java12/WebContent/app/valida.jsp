<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="banco.ValidaLogin"%>
<%@ page language="java" import="banco.Apagar"%>
<%@ page language="java" import="banco.Inserir"%>
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
		int id = Integer.parseInt(request.getParameter("idd"));
		Apagar a = new Apagar();
		a.apaga(id);
		out.print("<script>window.location.href='index.jsp?p=apagar'</script>");
	} else if (botao.equals("botaoinserir")) {
		String usuario = request.getParameter("usuario");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		Inserir in = new Inserir();
		in.inseri(usuario, email, tel);
		out.print("<script>window.location.href='index.jsp?p=inserir'</script>");		
	}
%>