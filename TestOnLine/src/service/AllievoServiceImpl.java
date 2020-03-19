package service;

import java.sql.Connection;

import dao.AllievoDAOImpl;
import dao.DataSource;
import dao.RispostaDAOImpl;
import entity.Allievo;

   
public class AllievoServiceImpl implements AllievoServiceInterface {
	
	private static AllievoServiceImpl instance;
	private AllievoDAOImpl dao;
	private DataSource dataSource;
	
	public static AllievoServiceImpl getInstance() throws Exception {
		if(instance==null) instance=new AllievoServiceImpl();
	return instance;
}

	
	private AllievoServiceImpl() throws Exception {
		     this.dataSource= DataSource.getInstance();
		     this.dao = AllievoDAOImpl.getInstance();
	}
				    
		                                                        
	@Override
	public void registraAllievo(Allievo a) throws Exception {
		Connection conn = dataSource.getConnection();     
		dao.insert(conn, a);                                        
		conn.commit();
	}

	@Override
	public Allievo leggiDatiAllievo(String username) throws Exception {
		Connection conn = dataSource.getConnection();    
		Allievo a = dao.select(conn, username);  		
		conn.commit();                 		
		return a; 

	}

	
	@Override
	public void cancellaAllievo(String username) throws Exception {
		Connection conn = dataSource.getConnection();    
		
		//delete allievo-quiz
		// delete report
		dao.delete(conn, username);
		conn.commit();
	}

	@Override
	public void modificaPassword(Allievo a, String newPass) throws Exception {
		Connection conn = dataSource.getConnection();    	
		a.setPassword(newPass);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaNome(Allievo a, String newNome) throws Exception {
		Connection conn = dataSource.getConnection();    
		a.setNome(newNome);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaCognome(Allievo a, String newCognome) throws Exception {
		Connection conn = dataSource.getConnection();    
		a.setCognome(newCognome);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaEmail(Allievo a, String newEmail) throws Exception {
		Connection conn = dataSource.getConnection();    
		a.setEmail(newEmail);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaStato(Allievo a, String newStato) throws Exception {
		
		Connection conn = dataSource.getConnection();    
		a.setStato(newStato);
		dao.update(conn, a);
		conn.commit();
		
	}


}
