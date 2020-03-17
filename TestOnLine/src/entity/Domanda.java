package entity;

public class Domanda {

	private int id;
	
	private int id_quiz;
	
	private String quesito;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_quiz() {
		return id_quiz;
	}

	public void setId_quiz(int id_quiz) {
		this.id_quiz = id_quiz;
	}

	public String getQuesito() {
		return quesito;
	}

	public void setQuesito(String quesito) {
		this.quesito = quesito;
	}

	@Override
	public String toString() {
		return "Domanda [id=" + id + ", id_quiz=" + id_quiz + ", quesito=" + quesito + "]";
	}
	
	
	
}
