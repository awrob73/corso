package service;

import java.sql.Connection;
import java.util.List;

import dao.AllievoDAOImpl;
import dao.AllievoQuizDAO;
import dao.AllievoQuizDAOImpl;
import dao.DataSource;
import dao.ReportDAO;
import dao.ReportDAOImpl;
import dao.RispostaDAOImpl;
import entity.Allievo;
import entity.AllievoQuiz;
import entity.Report;

public class AllievoServiceImpl implements AllievoServiceInterface {

	private static AllievoServiceImpl instance;
	private AllievoDAOImpl dao;
	private DataSource dataSource;
	private ReportDAOImpl reportDAO;
	private AllievoQuizDAOImpl aqDAO;

	public static AllievoServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new AllievoServiceImpl();
		return instance;
	}

	private AllievoServiceImpl() throws Exception {
		this.dataSource = DataSource.getInstance();
		this.dao = AllievoDAOImpl.getInstance();
		this.reportDAO = ReportDAOImpl.getInstance();
		this.aqDAO = AllievoQuizDAOImpl.getInstance();
	}

	@Override
	public void registraAllievo(Allievo a) throws Exception {
		Connection conn = dataSource.getConnection();
		dao.insert(conn, a);
		conn.commit();
	}

	@Override
	public Allievo leggiDatiAllievo(String username) throws Exception {
		Connection conn = dataSource.getConnection();
		Allievo a = dao.select(conn, username);
		conn.commit();
		return a;

	}

	@Override
	public void cancellaAllievo(String username) throws Exception {
		Connection conn = dataSource.getConnection();
		List<AllievoQuiz> aq = aqDAO.select(conn, username);
		for (AllievoQuiz allievoQuiz : aq) {

			List<Report> r = reportDAO.selectAll(conn, allievoQuiz);
			for (Report r1 : r) {

				reportDAO.delete(conn, r1);

			}
		}
		aqDAO.delete(conn, username);
		dao.delete(conn, username);
		conn.commit();

	}

	@Override
	public void modificaPassword(Allievo a, String newPass) throws Exception {
		Connection conn = dataSource.getConnection();
		a.setPassword(newPass);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaNome(Allievo a, String newNome) throws Exception {
		Connection conn = dataSource.getConnection();
		a.setNome(newNome);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaCognome(Allievo a, String newCognome) throws Exception {
		Connection conn = dataSource.getConnection();
		a.setCognome(newCognome);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaEmail(Allievo a, String newEmail) throws Exception {
		Connection conn = dataSource.getConnection();
		a.setEmail(newEmail);
		dao.update(conn, a);
		conn.commit();
	}

	@Override
	public void modificaStato(Allievo a, String newStato) throws Exception {

		Connection conn = dataSource.getConnection();
		a.setStato(newStato);
		dao.update(conn, a);
		conn.commit();

	}

}
