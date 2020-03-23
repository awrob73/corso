<%@page import="entity.Domanda"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function getAnswers(){
	var id_domanda = document.getElementById("h1").value;
	
	
	//utilizziamo ajax per lo scambio di dati con il server
	//creo un'istanza della classe ajax
    var xhttp = new XMLHttpRequest();
	//gestione della risposta
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("demo").innerHTML =
            this.responseText;
       }
    };
    //gestione della richiesta
    xhttp.open("GET", "getRisposte?id_domanda=" +id_domanda, true);
    //chiamata materiale
    xhttp.send();
}


</script>


</head>




<body>
<% List<Domanda> domande = (List<Domanda>)request.getAttribute("domande"); %>

<ul>
<% for(int i = 0; i < domande.size(); i++) {
	
	out.println("<li> domanda n. " + i + "</li> <br>" + domande.get(i).getQuesito() + "<br>");
	out.println("<form>" +
	" <input type='button' value='get risposte' onClick='getAnswers()'>" +
	" <input id='h1' type='hidden' name='id_domanda' value=" + domande.get(i).getId() + "> " +
	"</form>");
 } 
 %>
</ul>
<div id="demo"></div>
</body>
</html>