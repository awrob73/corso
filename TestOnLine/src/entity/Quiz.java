package entity;

public class Quiz {

	private int id;
	private String argomento;
	private String risposta;
	private int numero_domande;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArgomento() {
		return argomento;
	}
	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}
	public String getRisposta() {
		return risposta;
	}
	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}
	public int getNumero_domande() {
		return numero_domande;
	}
	public void setNumero_domande(int numero_domande) {
		this.numero_domande = numero_domande;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", argomento=" + argomento + ", risposta=" + risposta + ", numero_domande="
				+ numero_domande + ", username=" + username + "]";
	}
	
	
	
}
