<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="entity.Report"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Report> list = (List<Report>)request.getAttribute("report"); %>

Risultati report: </h2>  <br>
<% for(Report r : list){
	out.println(r.getDomanda().getQuesito());
	out.println(r.getRisposta().getDescrizione() + r.getRisposta().getValutazione());
}%>

();


</body>
</html>