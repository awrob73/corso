<%@page import="entity.Quiz"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Lista Argomenti </title>
<link rel="stylesheet" type="text/css" href="FormGrafica.css">

</head>
<style>
a:link, a:visited {
  background-color: #800000;
  color: white;
  padding: 14px 5px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  width: 200px;
  
}

li{
margin-bottom: 10px;
width: 200px;
list-style-type: none;
display: inline;

}

a:link:hover, a:visited:hover{
  background-color: #e40101;
  font-size: 15px;
  margin-bottom: 10px;

}
</style>

<body>
<div class=listquizArgomentiDiv> 
<% List<Quiz> lista = (List<Quiz>)request.getAttribute("descrizione"); %>

Elenco di tutti i quiz dell'argomento <strong> <%=lista.get(0).getArgomento().getDescrizione() %> </strong> <br>

<ul>
<% for(int i = 0; i< lista.size(); i++) {
	out.println("<li> <a href=getQuizId?Id="+ lista.get(i).getId() +"> id Quiz: "+ lista.get(i).getId()+" - Difficolta: " + lista.get(i).getDifficolta() + "</a> </li>");
 } 
 %>
</ul><br><br>
</div>
</body>
</html>