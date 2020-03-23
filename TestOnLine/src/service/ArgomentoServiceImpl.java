package service;

import java.sql.Connection;
import java.util.List;

import dao.AllievoDAOImpl;
import dao.ArgomentoDAOImpl;
import dao.DataSource;
import entity.Argomento;


public class ArgomentoServiceImpl implements ArgomentoServiceInterface {
	
	private static ArgomentoServiceImpl instance;
	private ArgomentoDAOImpl dao;
	private DataSource dataSource;
	
	public static ArgomentoServiceImpl getInstance() throws Exception {
		if(instance==null) instance=new ArgomentoServiceImpl();
	return instance;
}
	
	private ArgomentoServiceImpl() throws Exception {
	     this.dataSource= DataSource.getInstance();
	     this.dao = ArgomentoDAOImpl.getInstance();
}

	@Override
	public List<Argomento> getTuttiArgomenti() throws Exception {
		Connection conn = dataSource.getConnection();
		List<Argomento> lista = dao.selectAll(conn);
		conn.commit();
		
		return lista;
	}

	@Override
	public void cercaArgomento(String descrizione) throws Exception {
		Connection conn = dataSource.getConnection();
		
	}
	
	

}

