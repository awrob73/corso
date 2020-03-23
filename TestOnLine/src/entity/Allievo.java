package entity;

public class Allievo {

	private String username;
	
	private String nome;
	
	private String cognome;
	
	private String email;
	
	private String password;
	
	private String stato;
	
	

	public Allievo() {
		super();
	}
	

	public Allievo(String username, String nome, String cognome, String email, String password, String stato) {
		super();
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.stato = stato;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "Allievo [username=" + username + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", password=" + password + ", stato=" + stato + "]";
	}
	
	
}
