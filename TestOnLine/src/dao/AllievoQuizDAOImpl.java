package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import entity.Allievo;
import entity.AllievoQuiz;

public class AllievoQuizDAOImpl implements AllievoQuizDAO {

	private static AllievoQuizDAOImpl instance;

	public static AllievoQuizDAOImpl getInstance() throws Exception {
		if (instance == null)
			instance = new AllievoQuizDAOImpl();
		return instance;
	}

	private AllievoQuizDAOImpl() {
		super();
	}

	@Override
	public AllievoQuiz select(Connection conn, int id) throws Exception {
		String sql = "SELECT * FROM allievo_quiz WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			AllievoQuiz aq = new AllievoQuiz();
			aq.setId(rs.getInt("id"));
			aq.getQ().setId(rs.getInt("id_quiz"));
			aq.getA().setUsername(rs.getString("username"));
			aq.setDataReport(rs.getDate("data"));
			return aq;
		}

		conn.commit();
		return null;
	}

	@Override
	public List<AllievoQuiz> selectAll(Connection conn) throws Exception {
		String sql = "SELECT * FROM allievo_quiz";
		PreparedStatement ps = conn.prepareStatement(sql);
		List<AllievoQuiz> lista = new ArrayList<AllievoQuiz>();

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			AllievoQuiz aq = new AllievoQuiz();
			aq.setId(rs.getInt("id"));
			aq.getQ().setId(rs.getInt("id_quiz"));
			aq.getA().setUsername(rs.getString("username"));
			aq.setDataReport(rs.getDate("data"));
			lista.add(aq);
		}
		conn.commit();
		return lista;
	}

	@Override
	public List<AllievoQuiz> selectAllbyAllievo(Connection conn, int id) throws Exception {
		String sql = "SELECT * FROM allievo_quiz where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		List<AllievoQuiz> lista = new ArrayList<AllievoQuiz>();

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			AllievoQuiz aq = new AllievoQuiz();
			aq.setId(rs.getInt("id"));
			aq.getQ().setId(rs.getInt("id_quiz"));
			aq.getA().setUsername(rs.getString("username"));
			aq.setDataReport(rs.getDate("data"));
			lista.add(aq);
		}
		conn.commit();
		return lista;
	}

	@Override
	public void Insert(Connection conn, AllievoQuiz aq) throws Exception {
		String sql = "INSERT INTO allievo_quiz VALUES (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, aq.getId());
		ps.setInt(2, aq.getQ().getId());
		ps.setString(3, aq.getA().getUsername());
		ps.setDate(4, new Date(aq.getDataReport().getTime()));

		ps.executeUpdate();

	}

	@Override
	public void update(Connection conn, AllievoQuiz aq) throws Exception {
		String sql = "UPDATE allievo_quiz SET id_quiz=?, username = ?, data=? where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(4, aq.getId());
		ps.setInt(1, aq.getQ().getId());
		ps.setString(2, aq.getA().getUsername());
		ps.setDate(3, new Date(aq.getDataReport().getTime()));

		ps.executeUpdate();

	}

	@Override
	public void delete(Connection conn, AllievoQuiz aq) throws Exception {
		String sql = "DELETE from allievo_quiz where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, aq.getId());
		ps.executeUpdate();
	}

}
