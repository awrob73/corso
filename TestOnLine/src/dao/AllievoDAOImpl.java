package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Allievo;


public class AllievoDAOImpl implements AllievoDAO {
	
	private Connection conn;
	
	public AllievoDAOImpl() throws Exception {
		conn = SingletonConnection.getConnection();
	}
		

	@Override
	public Allievo select(String username) throws Exception {
		
		String sql = "select * from allievo where username = ?";        
		PreparedStatement ps = conn.prepareStatement(sql); 
		
		ps.setString(1, username);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) { 
			
			Allievo a = new Allievo();
			String uName = rs.getString("username");
			String pw = rs.getString("password");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			String email = rs.getString("email");
			String stato = rs.getString("stato");
			a.setUsername(uName);                         
			a.setPassword(pw);
			a.setNome(nome);
			a.setCognome(cognome);
			a.setEmail(email);
			a.setStato(stato);
			
			return a;
		}
		
		return null;
	}
	
	
	

	@Override
	public List<Allievo> selectAll() throws Exception {
		
		String sql = "select * from allievo";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		List<Allievo> list = new ArrayList<>();
		
		while(rs.next()) {
			Allievo a = new Allievo();
			String uName = rs.getString("username");
			String pw = rs.getString("password");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			String email = rs.getString("email");
			String stato = rs.getString("stato");
			a.setUsername(uName);                         
			a.setPassword(pw);
			a.setNome(nome);
			a.setCognome(cognome);
			a.setEmail(email);
			a.setStato(stato);
			list.add(a); 
			
		}
			return list;
	}		
		
		

	@Override
	public void insert(Allievo a) throws Exception {
		String sql = "insert into allievo value(?,?,?,?,?,?)";                  
		PreparedStatement ps = conn.prepareStatement(sql);                 
		
		ps.setString(1, a.getUsername());
		ps.setString(2, a.getPassword());
		ps.setString(3,  a.getNome());
		ps.setString(4,  a.getCognome());
		ps.setString(5,  a.getEmail());
		ps.setString(6,  a.getStato());
		
		ps.executeUpdate();              
	

	}

	@Override
	public void delete(String username) throws Exception {
		

	}

	@Override
	public void update(Allievo a) throws Exception {
		

	}

}
