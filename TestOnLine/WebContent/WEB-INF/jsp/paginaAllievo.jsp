<%@page import="entity.Allievo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="FormGrafica.css">
</head>
<body>
<%Allievo a = (Allievo)request.getAttribute("allievo"); %>
 
<div class="paginaAllievoDiv">

<h2>Benvenuto</h2>
Utente registrato: <strong> <%= a.getNome() %> <%= a.getCognome() %> </strong><br>

<form action="getAllievo">
<input type="hidden" name="username" value=<%=a.getUsername()%>>
<input type="submit" value='Visualizza dati'>
</form>
<p>
<form action="getQuiz">
<input type="hidden" name="username" value=<%=a.getUsername()%>>
<input type="submit" value="Visualizza quiz">
</form>
<p>
<form action="logout">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input type='submit' value='Logout'>
</form>

</div>
</body>
</html>