package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Utente;

public class UtenteDAOImpl implements UtenteDao {
	
	private Connection conn;
	
	
	public UtenteDAOImpl() throws Exception { //solleva l'errore quindi lo passerà a chi lo chiama ovvero UtenteDAOImpl, se lui non riesce lo passerà a UtenteServiceImpl e se nemmeno lui allora passerà alla Servlet e così via
		super();
		
		conn = SingletonConnection.getConnection();
	}

	 

	@Override
	public Utente select(String username) throws Exception {
		
		String sql = "select * from utente where username = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//adesso definiamo chi è il ?
		ps.setString(1, username);
		
		//posso lanciare la query (execute perchè deve stampare) tramite ResultSet che permette di recuperare il risultato
		ResultSet rs = ps.executeQuery();
		
		// while(rs.next()) normalmente sarebbe così perche ResultSet recupera riga per riga quindi se sono più righe serve un ciclo ma in questo caso essendo username PK ne uscirà sicuro una sola
		
		if(rs.next()) {
			
			String uName = rs.getString("username");
			String psw = rs.getString("password");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			
			//dopo aver recuperato possono settare i campi
			
			Utente u = new Utente();
			u.setUsername(uName);
			u.setPassword(psw);
			u.setNome(nome);
			u.setCognome(cognome);
			
			return u;
		}
		
		return null; //se non dovesse trovare nulla
	}

	@Override
	public List<Utente> selectAll() throws Exception {
		
		String sql = "select * from utente";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//posso lanciare la query (execute perchè deve stampare) tramite ResultSet che permette di recuperare il risultato
		ResultSet rs = ps.executeQuery();
		
		//Adesso recupero i dati.. per forza while perchè potrei avere più righe

		List<Utente> listaUtenti = new ArrayList<>();
		
		
		while(rs.next()) {
			
			String uName = rs.getString("username");
			String psw = rs.getString("password");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			
			//dopo aver recuperato possono settare i campi
			
			Utente u = new Utente();
			u.setUsername(uName);
			u.setPassword(psw);
			u.setNome(nome);
			u.setCognome(cognome);
			
			listaUtenti.add(u);
			
		}
		
		return listaUtenti; 
		
	}

	@Override
	public void insert(Utente u) throws Exception {
		
		String sql = "insert into utente values (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//adesso definiamo chi è il ?
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getNome());
		ps.setString(4, u.getCognome());
						
		//posso lanciare la query (update perchè deve fare modifiche)
		
		ps.executeUpdate();

	}

	@Override
	public void delete(String username) throws Exception {
		
		String sql = "delete from utente where username = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//adesso definiamo chi è il ?
		ps.setString(1, username);
		
		//posso lanciare la query (update perchè deve fare modifiche)
		
		ps.executeUpdate();
		

	}

	@Override
	public void update(Utente u) throws Exception {
		
		String sql = "update utente set password = ?, nome = ?, cognome = ? where username = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//adesso definiamo chi è il ?
		ps.setString(1, u.getPassword());
		ps.setString(2, u.getNome());
		ps.setString(3, u.getCognome());
		ps.setString(4, u.getUsername());
		
		//posso lanciare la query (update perchè deve fare modifiche)
		
		ps.executeUpdate();
		

	}

}
