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
	
	%>
	<%
		Domanda domanda = (Domanda) request.getAttribute("domanda");
		
		List<Risposta> risposte = (List<Risposta>) request.getAttribute("risposte");
		
		int i =(Integer) request.getAttribute("contatore1");
		
	%>

	<ul>
		<% 


				out.println("<li> domanda n. " + (i+1) + "</li> <br>" + domanda.getQuesito() + "<br>");
				
				out.println("<form action='getDomande'>");
				out.println("<input type='hidden' name='contatore' value="+(i+1)+">");
				out.println("<input type='hidden' name='id_quiz' value="+domanda.getQuiz().getId()+">");
				for (int j = 0; j < risposte.size(); j++) {
					
					out.println("<input type='radio' name='idRisposta' value="+risposte.get(j).getId()+">"
								+ risposte.get(j).getDescrizione()+"<br>");
					
				}out.println("<input type='submit' value='conferma' ></form> <p>");


		%>
	</ul>
	<div id="demo"></div>
</body>
</html>