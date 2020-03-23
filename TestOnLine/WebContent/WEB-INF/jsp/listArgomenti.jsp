<%@page import="entity.Argomento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Argomento> lista = (List<Argomento>)request.getAttribute("argomento"); %>

elenco di tutti gli argomenti dei quiz <br>

<ul>
<% for(int i = 0; i< lista.size(); i++) {
	out.println("<li>" + lista.get(i) + " <a href=AAA="+ lista.get(i).getDescrizione() +">visualizza quiz</a> </li>");
 } 
 %>
</ul><br><br>

</body>
</html>

