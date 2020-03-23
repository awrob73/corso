package service;

import java.sql.Connection;
import java.util.List;

import dao.DataSource;
import dao.DomandaDAOImpl;
import dao.RispostaDAOImpl;
import entity.Domanda;
import entity.Risposta;

public class RispostaServiceImpl implements RispostaServiceInterface {
	
	private static RispostaServiceImpl instance;
	private RispostaDAOImpl dao;
	private DataSource dataSource;

	private RispostaServiceImpl() throws Exception {
		this.dataSource = DataSource.getInstance();
		this.dao = RispostaDAOImpl.getInstance();
	
	}

	public static RispostaServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new RispostaServiceImpl();
		return instance;
	}

	@Override
	public List<Risposta> stampaRiposteDomanda(Domanda d) throws Exception {
		Connection conn =  dataSource.getConnection();
		List<Risposta> lista = dao.select(conn, d);
		conn.commit();
		return lista;
	}

	@Override
	public Risposta stampaRispostaId(int id) throws Exception {
		Connection conn =  dataSource.getConnection();
		Risposta r = dao.select(conn, id);
		conn.commit();
		return r;
	}

}
