package entity;

public class Quiz {

	private int id;
	
	private Argomento argomento;
	
	private String difficolta;
	
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Quiz(int id, Argomento argomento, String difficolta) {
		super();
		this.id = id;
		this.argomento = argomento;
		this.difficolta = difficolta;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Argomento getArgomento() {
		return argomento;
	}

	public void setArgomento(Argomento argomento) {
		this.argomento = argomento;
	}

	public String getDifficolta() {
		return difficolta;
	}

	public void setDifficolta(String difficolta) {
		this.difficolta = difficolta;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", argomento=" + argomento + ", difficolta=" + difficolta + "]";
	}

	
	


	
	
}
