package dao;

import java.util.List;

import entity.Utente;

public interface UtenteDao {
	
	//operazioni CRUD
	
	public Utente select(String username) throws Exception;
	public List<Utente> selectAll() throws Exception;
	public void insert(Utente u) throws Exception;
	public void delete(String username) throws Exception;
	public void update(Utente u) throws Exception;
	

}
