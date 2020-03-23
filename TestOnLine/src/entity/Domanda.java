package entity;

public class Domanda {

	private int id;
	
	private Quiz quiz;
	
	private String quesito;
	
	private int numeroDomanda;
	
	

	public Domanda() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Domanda(int id, Quiz quiz, String quesito, int numeroDomanda) {
		super();
		this.id = id;
		this.quiz = quiz;
		this.quesito = quesito;
		this.numeroDomanda = numeroDomanda;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public String getQuesito() {
		return quesito;
	}

	public void setQuesito(String quesito) {
		this.quesito = quesito;
	}

	
	public int getNumeroDomanda() {
		return numeroDomanda;
	}

	public void setNumeroDomanda(int numeroDomanda) {
		this.numeroDomanda = numeroDomanda;
	}

	@Override
	public String toString() {
		return "Domanda [id=" + id + ", quiz=" + quiz + ", quesito=" + quesito + ", numeroDomanda=" + numeroDomanda
				+ "]";
	}
//
	
}
