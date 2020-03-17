package service;

import java.sql.Connection;

import dao.AllievoDAOImpl;
import dao.SingletonConnection;
import entity.Allievo;


public class AllievoServiceImpl implements AllievoServiceInterface {
	
	private AllievoDAOImpl dao;
	private Connection conn;
	
	
	
	public AllievoServiceImpl() throws Exception {
		dao = new AllievoDAOImpl();                     
		conn = SingletonConnection.getConnection();   
	}
				    
		                                                        
	

	@Override
	public void registraAllievo(Allievo a) throws Exception {
		dao.insert(a);                                        
		conn.commit();
		
	}

	@Override
	public Allievo leggiDatiAllievo(String username) throws Exception {
		Allievo a = dao.select(username);  		
		conn.commit();                 		
		return a; 
	}

	
	
	
	@Override
	public void cancellaAllievo(String username) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificaPassword(Allievo a, String newPass) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificaNome(Allievo a, String newNome) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificaCognome(Allievo a, String newCognome) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificaEmail(Allievo a, String newEmail) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificaStato(Allievo a, String newStato) throws Exception {
		// TODO Auto-generated method stub

	}

}
