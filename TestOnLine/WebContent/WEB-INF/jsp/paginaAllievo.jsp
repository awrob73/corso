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
ciao
<%Allievo a = (Allievo)request.getAttribute("allievo"); %>

Benvenuto <%= a.getNome() %> <%= a.getCognome() %> <br>



</body>
</html>