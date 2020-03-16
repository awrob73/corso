package entity;

public class Quiz {

	private int id;
	
	private int  id_argomento;
	
	private String difficolta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_argomento() {
		return id_argomento;
	}

	public void setId_argomento(int id_argomento) {
		this.id_argomento = id_argomento;
	}

	public String getDifficolta() {
		return difficolta;
	}

	public void setDifficolta(String difficolta) {
		this.difficolta = difficolta;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", id_argomento=" + id_argomento + ", difficolta=" + difficolta + "]";
	}
	


	
	
}
