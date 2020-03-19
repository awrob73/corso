package dao;

import java.sql.Connection;
import java.util.List;

import entity.Argomento;

public class ArgomentoDAOImpl implements ArgomentoDAO {

	private static ArgomentoDAOImpl instance;

	public static ArgomentoDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new ArgomentoDAOImpl();
	return instance;
}
	
	private ArgomentoDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Argomento> selectAll(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Argomento select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
