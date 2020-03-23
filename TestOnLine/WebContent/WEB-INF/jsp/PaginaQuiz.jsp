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

<%Allievo a = (Allievo)request.getAttribute("allievo"); %>

 
PAGINA QUIZ

<p>
 
Benvenuto <%= a.getNome() %> <%= a.getCognome() %> <br>

<form action="argomenti">
<input type="hidden" name="username" value=<%=a.getUsername()%>>
<input type="submit" value='Visualizza argomenti'>
</form>
<p>
<form action="getQuizId">
<input type="text" name = "Id"> id quiz <br> 
<input type="hidden" name="username" value=<%=a.getUsername()%>>
<input type="submit" value="Visualizza quiz">
</form>
<p>
<form action="getQuizUtente">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input type='submit' value='Quiz svolti'>


</form>


</body>
</html>