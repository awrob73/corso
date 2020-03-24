
<%@page import="entity.Quiz"%>
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

<% List<Quiz> lista = (List<Quiz>)request.getAttribute("descrizione"); %>

elenco di tutti i quiz dell'argomento <%=lista.get(0).getArgomento().getDescrizione() %><br>

<ul>
<% for(int i = 0; i< lista.size(); i++) {
	out.println("<li> <a href=getQuizId?Id="+ lista.get(i).getId() +"> id Quiz: "+ lista.get(i).getId()+" - Difficolta: " + lista.get(i).getDifficolta() + "</a> </li>");
 } 
 %>
</ul><br><br>

</body>
</html>