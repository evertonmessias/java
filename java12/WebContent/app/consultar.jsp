<table class="tabela <%out.print(request.getParameter("p"));%>">
	<tr class="<%out.print(request.getParameter("p"));%>">
		<th>Id</th>
		<th>Nome</th>
		<th>Telefone</th>
		<th>E-Mail</th>
	</tr>
	<c:forEach var="dados" items="${clientes.lista}">
		<tr class="linha" id="linha${dados.id}" onclick="<%out.print(request.getParameter("p"));%>(${dados.id})">
			<td class="tdid">${dados.id}</td>
			<td class="tusuario${dados.id}">${dados.nome}</td>
			<td class="ttelefone${dados.id}">${dados.telefone}</td>
			<td class="temail${dados.id}">${dados.email}</td>
		</tr>
	</c:forEach>
</table>

