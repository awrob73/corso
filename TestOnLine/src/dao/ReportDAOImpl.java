package dao;

import java.sql.Connection;
import java.util.List;

import entity.Allievo;
import entity.Report;

public class ReportDAOImpl implements ReportDAO {

	
	private static ReportDAOImpl instance;

	public static ReportDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new ReportDAOImpl();
	return instance;
}
	
	private ReportDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Report select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Report> selectAll(Connection conn, Allievo a) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Report> selectAll(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Connection conn, Report r) throws Exception {
		// TODO Auto-generated method stub

	}

}
