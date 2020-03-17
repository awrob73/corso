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
 
PAGINA PRIVATA ALLIEVO
<p>
 
Benvenuto <%= a.getNome() %> <%= a.getCognome() %> <br>

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





</body>
</html>