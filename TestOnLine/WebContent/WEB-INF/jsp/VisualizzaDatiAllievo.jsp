<%@page import="entity.Allievo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--     sgs -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="FormGrafica.css">
</head>
<div class="VisualizzaDatiAllievoDiv">
<% Allievo a = (Allievo)request.getAttribute("allievo");  %>

<h2 id="VisualizzaDatiAllievoh2"> Dati allievo </h2>  <br>


<strong>username: </strong>
<%= a.getUsername() %> <br>
<strong>password: </strong>
<%= a.getPassword() %> <br>
<strong>nome: </strong>
<%= a.getNome() %> <br>
<strong>cognome: </strong>
<%= a.getCognome() %> <br>
<strong>email: </strong>
<%= a.getEmail() %> <br>

<form action="modificaDati">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input class="VisualizzaDatiAllievoSubmit"type='submit' value='modifica allievo'>
</form>

<form action="cancellaAllievo">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input class="VisualizzaDatiAllievoSubmit"type='submit' value='Elimina account'>
</form>

</div>
</body>
</html>