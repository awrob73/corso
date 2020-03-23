package service;

import java.sql.Connection;
import java.util.List;

import dao.DataSource;
import dao.DomandaDAOImpl;
import dao.QuizDAOImpl;
import dao.RispostaDAOImpl;
import entity.Domanda;
import entity.Quiz;

public class DomandaServiceImpl implements DomandaServiceInterface {
	
	private static DomandaServiceImpl instance;
	private DomandaDAOImpl dao;
	private DataSource dataSource;

	private DomandaServiceImpl() throws Exception {
		this.dataSource = DataSource.getInstance();
		this.dao = DomandaDAOImpl.getInstance();
	
	}

	public static DomandaServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new DomandaServiceImpl();
		return instance;
	}

	@Override
	public Domanda leggiDomanda(int id) throws Exception {
		Connection conn = dataSource.getConnection();
		Domanda d = dao.select(conn, id);
		conn.commit();
		return d;
	}

	@Override
	public List<Domanda> stampaDomandeQuiz(Quiz q) throws Exception {
		Connection conn = dataSource.getConnection();
		List<Domanda> lista = dao.select(conn, q);
		conn.commit();
		return lista;
	}

	@Override
	public List<Domanda> stampaDomande() throws Exception {
		Connection conn = dataSource.getConnection();
		List<Domanda> lista = dao.selectAll(conn);
		conn.commit();
		return lista;
	}

}
