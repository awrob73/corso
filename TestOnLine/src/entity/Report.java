package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report {
	
	private int id;
	
	private Domanda domanda;
	
	private Risposta risposta;
	
	private Allievo allievo;
	
	private AllievoQuiz aq;
	
	private Quiz quiz;
	
	private Date dataReport;

	public Report() {
		super();
	}

	public Report(int id, Domanda domanda, Risposta risposta, Allievo allievo, AllievoQuiz aq, Quiz quiz,
			Date dataReport) {
		super();
		this.id = id;
		this.domanda = domanda;
		this.risposta = risposta;
		this.allievo = allievo;
		this.aq = aq;
		this.quiz = quiz;
		this.dataReport = dataReport;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	public Risposta getRisposta() {
		return risposta;
	}

	public void setRisposta(Risposta risposta) {
		this.risposta = risposta;
	}

	public Allievo getAllievo() {
		return allievo;
	}

	public void setAllievo(Allievo allievo) {
		this.allievo = allievo;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	public Date getDataReport() {
		return dataReport;
	}
	
	private String formattaDataReport() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataReport);
	}

	public void setDataReport(Date dataReport) {
		this.dataReport = dataReport;
	}

	public AllievoQuiz getAq() {
		return aq;
	}

	public void setAq(AllievoQuiz aq) {
		this.aq = aq;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", domanda=" + domanda + ", risposta=" + risposta + ", aq=" + aq + ", quiz=" + quiz
				+ ", dataReport=" + formattaDataReport() + "]";
	}




	
}
