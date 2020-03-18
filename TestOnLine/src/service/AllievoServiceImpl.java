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
		//delete allievo-quiz
		// delete report
		dao.delete(username);
		conn.commit();
	}

	@Override
	public void modificaPassword(Allievo a, String newPass) throws Exception {
		a.setPassword(newPass);
		dao.update(a);
		conn.commit();
	}

	@Override
	public void modificaNome(Allievo a, String newNome) throws Exception {
		a.setNome(newNome);
		dao.update(a);
		conn.commit();
	}

	@Override
	public void modificaCognome(Allievo a, String newCognome) throws Exception {
		a.setCognome(newCognome);
		dao.update(a);
		conn.commit();
	}

	@Override
	public void modificaEmail(Allievo a, String newEmail) throws Exception {
		a.setEmail(newEmail);
		dao.update(a);
		conn.commit();
	}

	@Override
	public void modificaStato(Allievo a, String newStato) throws Exception {
		
		a.setStato(newStato);
		dao.update(a);
		conn.commit();
		
	}


}
