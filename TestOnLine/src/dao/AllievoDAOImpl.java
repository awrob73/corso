package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entity.Allievo;

public class AllievoDAOImpl implements AllievoDAO {

	private Connection conn;
	
	public AllievoDAOImpl() throws Exception{
		conn = SingletonConnection.getConnection();
		
		}
	@Override
	public Allievo select(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Allievo> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Allievo a) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String username) throws Exception {
		
		String sql = "delete from allievo where username = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, username);
		
		
		ps.executeUpdate(); 
		
		conn.commit();

	}

	@Override
	public void update(Allievo a) throws Exception {
		String sql = "update allievo set nome = ?, cognome = ?, email=?, password=?, stato=? where username=?";
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
