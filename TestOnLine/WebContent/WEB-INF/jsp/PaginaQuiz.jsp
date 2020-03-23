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
<div class="PaginaQuizDiv">
<%Allievo a = (Allievo)request.getAttribute("allievo"); %>

 
<h1 class="PaqinaQuizh1">PAGINA QUIZ </h1>

<p> Benvenuto <strong> <%= a.getNome() %> <%= a.getCognome() %></p> </strong>
 
<form  action="argomenti">
<input type="hidden" name="username" value=<%=a.getUsername()%>>
<input id="PaginaQuizCerca" type="submit" value='Visualizza argomenti'>
</form>
<p>
<form action="getQuizId">
Inserisci <strong>id quiz </strong>
<input type="text" name = "Id" placeholder="Digita Id quiz"> 
<input type="hidden" name="username" value=<%=a.getUsername()%>>
<input type="submit" value="Visualizza quiz">
</form>
<p>
<form action="getQuizUtente">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input id="PaginaQuizCerca" type='submit' value='Quiz svolti'>


</form>

</div>


</body>
</html>