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

<% Allievo a = (Allievo)request.getAttribute("allievo");  %>

Allievo registrato correttamente. Riepilogo dati: <br>


username: <%= a.getUsername() %> <br>
password: <%= a.getPassword() %> <br>
nome: <%= a.getNome() %> <br>
cognome: <%= a.getCognome() %> <br>
email: <%= a.getEmail() %> <br>

<form action="modificaDati">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input type='submit' value='modifica allievo'>
</form>

<form action="cancellaAllievo">
<input type='hidden' name='username' value=<%=a.getUsername()%>>
<input type='submit' value='Elimina account'>
</form>

</body>
</html>