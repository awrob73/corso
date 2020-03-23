package entity;

public class Domanda {

	private int id;
	
	private Quiz quiz;
	
	private String quesito;
	
	private int numero_domanda;

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

	
	public int getNumero_domanda() {
		return numero_domanda;
	}

	public void setNumero_domanda(int numero_domanda) {
		this.numero_domanda = numero_domanda;
	}

	@Override
	public String toString() {
		return "Domanda [id=" + id + ", quiz=" + quiz + ", quesito=" + quesito + ", numero_domanda=" + numero_domanda
				+ "]";
	}

	
}
