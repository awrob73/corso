
<%@page import="entity.Allievo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica Dati Allievo</title>
<link rel="stylesheet" type="text/css" href="FormGrafica.css">
<div class="formModificaDatiDiv">
</head>
<body>
<%Allievo a = (Allievo)request.getAttribute("allievo");  %> <strong>
<%=a.getUsername()%> </strong> ecco i tuoi dati, puoi modificarli. <p>
<form action="modificaAllievo">
        <strong> Nome </strong>
		<input type="text" name="nome" value=<%=a.getNome() %>>  <br>
		<strong> Cognome </strong>
		<input type="text" name="cognome" value= <%=a.getCognome() %> >  <br>
		<strong> Username </strong>
		<input type="text" name="username" value = <%=a.getUsername()%> > <br>
		<strong> Email </strong>
	    <input type="text" name="email" value=<%=a.getEmail() %>>  <br>
	    <strong> Password </strong>
		<input type="text" name="password" value=<%=a.getPassword() %>>  <br>
		<input type="submit" value="modifica">

</form>

</div>
</body>
</html>