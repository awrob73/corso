package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.AllievoQuiz;
import entity.Report;

public class ReportDAOImpl implements ReportDAO {

	
	private static ReportDAOImpl instance;

	public static ReportDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new ReportDAOImpl();
	return instance;
    }
	
	
	private ReportDAOImpl() {
		super();
	}

	
	@Override
	public Report select(Connection conn, int id) throws Exception {
		
		String sql = "SELECT * FROM report WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Report r = new Report();
			r.setId(rs.getInt("id"));
			r.getQuiz().setId(rs.getInt("id_quiz"));
			r.getDomanda().setId(rs.getInt("id_domanda"));
			r.getRisposta().setId(rs.getInt("id_risposta"));
			r.getAq().setId(rs.getInt("id_allievoQuiz"));
			r.setDataReport(rs.getDate("dataReport"));
			
			return r;
		}
		conn.commit();
		return null;
	}

	
	@Override
	public List<Report> selectAll(Connection conn, AllievoQuiz aq) throws Exception {
		
		String sql = "SELECT * FROM report WHERE id_allievo_quiz=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, aq.getId());
		
		List<Report> lista = new ArrayList<Report>();

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Report r = new Report();

			
			r.getAq().setId(rs.getInt("id_allievoQuiz"));
			r.setId(rs.getInt("id"));
			r.getQuiz().setId(rs.getInt("id_quiz"));
			r.getDomanda().setId(rs.getInt("id_domanda"));
			r.getRisposta().setId(rs.getInt("id_risposta"));
			r.setDataReport(rs.getDate("data"));
			lista.add(r);
			
		}
		
		conn.commit();
		return lista;
	
	}
	

	@Override
	public List<Report> selectAll(Connection conn) throws Exception {
		
		String sql = "select * from report";
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Report> list = new ArrayList<>();

		while (rs.next()) {
			Report r = new Report();
			
			r.setId(rs.getInt("id"));
			r.getQuiz().setId(rs.getInt("id_quiz"));
			r.getDomanda().setId(rs.getInt("id_domanda"));
			r.getRisposta().setId(rs.getInt("id_risposta"));
			r.getAq().setId(rs.getInt("id_allievo_quiz"));
			r.setDataReport(rs.getDate("data"));

			list.add(r);
		}
		conn.commit();
		return list;
	}
	

	
	@Override
	public void insert(Connection conn, Report r) throws Exception {
		
		String sql = "INSERT INTO report VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, r.getId());
		ps.setInt(2, r.getQuiz().getId());
		ps.setInt(3, r.getDomanda().getId());
		ps.setInt(4, r.getRisposta().getId());
		ps.setInt(5, r.getAq().getId());
		ps.setDate(6, new Date(r.getDataReport().getTime()));

		ps.executeUpdate();
	}

	
	@Override
	public void delete(Connection conn, Report r) throws Exception {
		String sql = "DELETE from report where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, r.getId());
		ps.executeUpdate();
	}
		
	
	@Override
	public void update(Connection conn, Report r) throws Exception {
		
		String sql = "UPDATE report SET id_quiz=?, id_domanda=?, id_risposta=?, id_allievo_quiz=?, dataReport=? where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(6, r.getId());
		ps.setInt(1, r.getQuiz().getId());
		ps.setInt(2, r.getDomanda().getId());
		ps.setInt(3, r.getRisposta().getId());
		ps.setInt(4, r.getAq().getId());
		ps.setDate(5, new Date(r.getDataReport().getTime()));

		ps.executeUpdate();
	}
}

