package entity;

public class Argomento {
	
	private int id;
	
	private String descrizione;

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
