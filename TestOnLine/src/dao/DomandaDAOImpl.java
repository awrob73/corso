package dao;

import java.sql.Connection;
import java.util.List;

import entity.Domanda;
import entity.Quiz;

public class DomandaDAOImpl implements DomandaDAO {

	private static DomandaDAOImpl instance;

	public static DomandaDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new DomandaDAOImpl();
	return instance;
}
	
	private DomandaDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Domanda> select(Connection conn, Quiz q) throws Exception {
		// valentina
		return null;
	}

	@Override
	public Domanda select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
