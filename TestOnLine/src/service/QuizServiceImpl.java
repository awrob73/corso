package service;

import java.sql.Connection;
import java.util.List;

import dao.DataSource;
import dao.DomandaDAOImpl;
import dao.QuizDAOImpl;
import dao.RispostaDAOImpl;
import entity.Allievo;
import entity.Argomento;
import entity.Domanda;
import entity.Quiz;
import entity.Risposta;

public class QuizServiceImpl implements QuizServiceInterface {

	private static QuizServiceImpl instance;
	private QuizDAOImpl dao;
	private DomandaDAOImpl domanda;
	private RispostaDAOImpl risposta;
	private DataSource dataSource;

	private QuizServiceImpl() throws Exception {
		this.dataSource = DataSource.getInstance();
		this.dao = QuizDAOImpl.getInstance();
		this.domanda = DomandaDAOImpl.getInstance();
		this.risposta = RispostaDAOImpl.getInstance();
	}

	public static QuizServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new QuizServiceImpl();
		return instance;
	}

	@Override
	public void registraQuiz(Quiz q) throws Exception {
		Connection conn = dataSource.getConnection();
		dao.insert(conn, q);
		conn.commit();

	}

	@Override
	public List<Quiz> selectAll() throws Exception {
		Connection conn = dataSource.getConnection();
		List<Quiz> lista = dao.selectALL(conn);
		conn.commit();
		return lista;
	}

	@Override
	public List<Quiz> selectQuizAllievo(Allievo a) throws Exception {
		Connection conn = dataSource.getConnection();
		List<Quiz> lista = dao.select(conn, a);
		conn.commit();
		return lista;
	}

	@Override
	public Quiz selectQuiz(int id) throws Exception {
		Connection conn = dataSource.getConnection();
		Quiz q = dao.select(conn, id);
		conn.commit();
		return q;
	}

	@Override
	public List<Argomento> selectAllArgomento() throws Exception {

		return null;
	}

	@Override
	public List<Quiz> selectQuizArgomento(Argomento arg) throws Exception {
		Connection conn = dataSource.getConnection();
		List<Quiz> lista = dao.select(conn, arg);
		conn.commit();
		return lista;
	}

	@Override
	public void updateQuiz(Quiz q) throws Exception {
		Connection conn = dataSource.getConnection();
		dao.update(conn, q);
		conn.commit();

	}

	@Override
	public void deleteQuiz(Quiz q) throws Exception {
		Connection conn = dataSource.getConnection();
		dao.delete(conn, q);
		conn.commit();
	}

	@Override
	public List<Domanda> selectAllByQuiz(Quiz q) throws Exception {
		Connection conn = dataSource.getConnection();
		List<Domanda> lista = domanda.select(conn, q);
		conn.commit();
		return lista;
	}

	@Override
	public List<Risposta> selectAllByDomanda(Domanda d) throws Exception {
		Connection conn = dataSource.getConnection();
		List<Risposta> lista = risposta.select(conn, d);
		conn.commit();
		return lista;
	}

}
