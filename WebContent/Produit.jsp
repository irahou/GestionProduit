<%@page import="metier.ProduitMetier"%>
<%@page import="java.util.Iterator"%>
<%@page import="web.ProduitBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestion des produits</title>
</head>
<body>
	<%	ProduitBean produits ;
	if(request.getAttribute("model")== null)
		produits = new ProduitBean();
	else
		 produits = (ProduitBean)request.getAttribute("model");
	%>
	<h2>Tuto J2EE</h2>
	<h4>Ajouter un nouveau produit</h4>
	<form action="AfficherInfo" method="post">
	<table border="1" width="50%">
		<tr>
			<td>Nom:</td>
			<td><input type="text" name="nom"/></td>
		</tr>
		<tr>
			<td>Description:</td>
			<td><input type="text" name="desc"/></td>
		</tr>
		<tr>
			<td>Prix:</td>
			<td><input type="text" name="prix"/></td>
		</tr>
		<tr>
			<td>Etat:</td>
			<td><input type="text" name="etat"/></td>
		</tr>	
		<tr>
			<td colspan="2"><input type="submit" value="Valider"/></td>
		</tr>
	</table>
	</form>
	<table border="1" width="60%">
		<tr>
			<th>Id</th>
			<th>Nom</th>
			<th>Description</th>
			<th>Prix</th>
			<th>Etat</th>
		</tr>
		<%
		 Iterator<ProduitMetier> ip = produits.getVp().iterator();
		while(ip.hasNext()){
			ProduitMetier p = ip.next();
		
		%>
		
		<tr>
			<th><%=p.getId()%></th>
			<th><%=p.getNom() %></th>
			<th><%=p.getDesc() %></th>
			<th><%=p.getPrix() %></th>
			<th><%=p.getEtat() %></th>
		</tr>
	<% }%>
	</table>
</body>
</html>