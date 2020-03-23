
<%@page import="entity.Argomento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Argomenti</title>
<link rel="stylesheet" type="text/css" href="FormGrafica.css">
</head>
<body>
<style>
a:link, a:visited {
  background-color: #800000;
  color: white;
  padding: 14px 5px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  width: 110px;
  
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

<% List<Argomento> lista = (List<Argomento>)request.getAttribute("argomento"); %>

<div class="listaArgomentiDiv">

<h2 class="listaArgomentiH2"> <strong>  Elenco di tutti gli argomenti dei quiz: </strong> </h2> <br>

<ul>
<% for(int i = 0; i< lista.size(); i++) {
	out.println("<li> <a href=AAA="+ lista.get(i).getDescrizione() +">"+ lista.get(i).getDescrizione() + "</a> </li>");
 } 
 %>
</ul><br><br>
</div>
</body> 
</html>
