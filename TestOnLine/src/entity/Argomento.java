package entity;

public class Argomento {
	
	private int id;
	
	private String descrizione;
	
	

	public Argomento() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Argomento(int id, String descrizione) {
		super();
		this.id = id;
		this.descrizione = descrizione;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Argomento [id=" + id + ", descrizione=" + descrizione + "]";
	}
	
	

}
