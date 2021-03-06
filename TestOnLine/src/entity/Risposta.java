package entity;

public class Risposta {

	private int id;
	
	private Domanda domanda;
	
	private String descrizione;
	
	private int valutazione;
	
	

	public Risposta() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Risposta(int id, Domanda domanda, String descrizione, int valutazione) {
		super();
		this.id = id;
		this.domanda = domanda;
		this.descrizione = descrizione;
		this.valutazione = valutazione;
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getValutazione() {
		return valutazione;
	}

	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}

	@Override
	public String toString() {
		return "Risposta [id=" + id + ", domanda=" + domanda + ", descrizione=" + descrizione + ", valutazione="
				+ valutazione + "]";
	}

	
}
