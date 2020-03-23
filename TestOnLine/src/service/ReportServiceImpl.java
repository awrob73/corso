package service;

import java.sql.Connection;
import java.util.List;

import dao.DataSource;
import dao.ReportDAOImpl;
import dao.RispostaDAOImpl;
import entity.Allievo;
import entity.AllievoQuiz;
import entity.Report;

public class ReportServiceImpl implements ReportServiceInterface {
	
	private static ReportServiceImpl instance;
	private ReportDAOImpl dao;
	private DataSource dataSource;

	private ReportServiceImpl() throws Exception {
		this.dataSource = DataSource.getInstance();
		this.dao = ReportDAOImpl.getInstance();
	
	}

	public static ReportServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new ReportServiceImpl();
		return instance;
	}

	@Override
	public void createReport(Report r) throws Exception {
		Connection conn = dataSource.getConnection();
		dao.insert(conn, r);
		conn.commit();
	}

	@Override
	public List<Report> readReport(Allievo a) throws Exception {
		Connection conn = dataSource.getConnection();
		conn.commit();
		return null;
	}

	@Override
	public List<Report> readAllReport() throws Exception {
		Connection conn = dataSource.getConnection();
		List<Report> lista = dao.selectAll(conn);
		conn.commit();
		return lista;
	}

	@Override
	public Report readReport(int id) throws Exception {
		Connection conn = dataSource.getConnection();
		Report r = dao.select(conn, id);
		conn.commit();
		return r;
	}

	@Override
	public List<Report> readReport(AllievoQuiz aq) throws Exception {
		Connection conn = dataSource.getConnection();
		List<Report> lista = dao.selectAll(conn, aq);
		conn.commit();
		return lista;
	}

}
