<%@page import="entity.Domanda"%>
<%@page import="entity.Risposta"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function getAnswers() {
		var id_domanda = document.getElementById("h1").value;

		//utilizziamo ajax per lo scambio di dati con il server
		//creo un'istanza della classe ajax
		var xhttp = new XMLHttpRequest();
		//gestione della risposta
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("demo").innerHTML = this.responseText;
			}
		};
		//gestione della richiesta
		xhttp.open("GET", "getRisposte?id_domanda=" + id_domanda, true);
		//chiamata materiale
		xhttp.send();
	}
</script>


</head>




<body>
	<%
		List<Domanda> domande = (List<Domanda>) request.getAttribute("domande");
	%>
	<%
		List<Risposta> risposte = (List<Risposta>) request.getAttribute("risposte");
	%>

	<ul>
		<% 
			for (int i = 0; i < domande.size(); i++) {

				out.println("<li> domanda n. " + (i + 1) + "</li> <br>" + domande.get(i).getQuesito() + "<br>");
				out.println("<form action='getRisposte'>");
				for (int j = 0; j < risposte.size(); j++) {
					

					if (risposte.get(j).getDomanda().getId() == domande.get(i).getId()) {

						out.println("<input type='radio' name='idRisposta' value="+risposte.get(j).getId()+">"
								+ risposte.get(j).getDescrizione()+"<br>");
					}
				}out.println("<input type='submit' value='conferma' ></form>");

			}
		%>
	</ul>
	<div id="demo"></div>
</body>
</html>