package dao;

import java.sql.Connection;
import java.util.List;

import entity.Domanda;
import entity.Risposta;

public class RispostaDAOImpl implements RispostaDAO {

	private static RispostaDAOImpl instance;

	public static RispostaDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new RispostaDAOImpl();
	return instance;
}
	
	private RispostaDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Risposta> select(Connection conn, Domanda d) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Risposta select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Connection conn, Risposta risp) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Risposta risp) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Connection conn, Risposta risp) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
