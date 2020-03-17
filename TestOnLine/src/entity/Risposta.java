package entity;

public class Risposta {

	private int id;
	
	private int id_domanda;
	
	private String descrizione;
	
	private int valutazione;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_domanda() {
		return id_domanda;
	}

	public void setId_domanda(int id_domanda) {
		this.id_domanda = id_domanda;
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
		return "Risposta [id=" + id + ", id_domanda=" + id_domanda + ", descrizione=" + descrizione + ", valutazione="
				+ valutazione + "]";
	}
	
	
}
