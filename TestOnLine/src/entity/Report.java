package entity;

public class Report {
	
	private int id;
	
	private Domanda domanda;
	
	private Risposta risposta;
	
	private Allievo allievo;
	
	private Quiz quiz;

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

	@Override
	public String toString() {
		return "Report [id=" + id + ", domanda=" + domanda + ", risposta=" + risposta + ", allievo=" + allievo
				+ ", quiz=" + quiz + "]";
	}
	
}
