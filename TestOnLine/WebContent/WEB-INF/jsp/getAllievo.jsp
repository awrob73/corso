<%@page import="entity.Allievo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Allievo a = (Allievo) request.getAttribute("allievo"); %>

Dati allievo: <br>

<p> 

<%= a.getUsername() %> <br>
<%= a.getPassword() %> <br>
<%= a.getNome() %> <br>
<%= a.getCognome() %> <br>
<%= a.getEmail() %> <br>
<%= a.getStato() %> <br>


</body>
</html>