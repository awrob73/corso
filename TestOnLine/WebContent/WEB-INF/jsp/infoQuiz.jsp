<%@page import="entity.Quiz"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Quiz q = (Quiz) request.getAttribute("quiz"); %>

Dati quiz: <br>

<p> 

<%= q.getId() %> <br>
<%= q.getArgomento().getDescrizione() %> <br>
<%= q.getDifficolta() %> <p>

<form action="getDomande">
<input type="hidden" name="id_quiz" value=<%=q.getId()%>>
<input type="submit" value="Svolgi!">
</form>
</body>
</html>