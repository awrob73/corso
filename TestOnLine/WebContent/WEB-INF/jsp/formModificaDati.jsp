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
<%Allievo a = (Allievo)request.getAttribute("allievo");  %>
<%=a.getUsername()%> ecco i tuoi dati, puoi modificarli. <p>
<form action="modificaAllievo">

		<input type="text" name="nome" value=<%=a.getNome() %>> nome <br>
		<input type="text" name="cognome" value= <%=a.getCognome() %> > cognome <br>
		<input type="hidden" name="username" value = <%=a.getUsername()%>> <br>
	    <input type="text" name="email" value=<%=a.getEmail() %>> email <br>
		<input type="text" name="password" value=<%=a.getPassword() %>> password <br>
		<input type="submit" value="modifica">

</form>


</body>
</html>