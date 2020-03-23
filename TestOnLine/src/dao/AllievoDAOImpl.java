package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import entity.Allievo;

public class AllievoDAOImpl implements AllievoDAO {

private static AllievoDAOImpl instance;


	
	public static AllievoDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new AllievoDAOImpl();
	return instance;
}


	private AllievoDAOImpl() throws Exception {
		
	}

	@Override
	public Allievo select(Connection conn, String username) throws Exception {

		String sql = "SELECT * FROM allievo WHERE username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Allievo a = new Allievo();
			a.setUsername(rs.getString("username"));
			a.setNome(rs.getString("nome"));
			a.setCognome(rs.getString("cognome"));
			a.setEmail(rs.getString("email"));
			a.setPassword(rs.getString("password"));
			a.setStato(rs.getString("stato"));
			return a;

		}

		conn.commit();
		return null;

	}

	@Override
	public List<Allievo> selectAll(Connection conn) throws Exception {

		String sql = "select * from allievo";
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Allievo> list = new ArrayList<>();

		while (rs.next()) {
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
		conn.commit();
		return list;
	}

	@Override
	public void insert(Connection conn, Allievo a) throws Exception {
		String sql = "insert into allievo value(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, a.getUsername());
		ps.setString(2, a.getNome());
		ps.setString(3, a.getCognome());
		ps.setString(4, a.getEmail());
		ps.setString(5, a.getPassword());
		ps.setString(6, a.getStato());

		ps.executeUpdate();



	}

	@Override
	public void delete(Connection conn, String username) throws Exception {
		String sql = "delete from allievo where username = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, username);
		
		ps.executeUpdate(); 
		conn.commit();
	}

	@Override
	public void update(Connection conn, Allievo a) throws Exception {
		String sql = "UPDATE allievo SET nome=?, cognome=?, email=?, password=?, stato=? WHERE username=? ";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, a.getNome());
		ps.setString(2, a.getCognome());
		ps.setString(3, a.getEmail());
		ps.setString(4, a.getPassword());
		ps.setString(5, a.getStato());
		ps.setString(6, a.getUsername());

		ps.executeUpdate();
		conn.commit();

	}

}
