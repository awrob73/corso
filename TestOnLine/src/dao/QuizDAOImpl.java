package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Allievo;
import entity.Argomento;
import entity.Quiz;

public class QuizDAOImpl implements QuizDAO {

	private static QuizDAOImpl instance;

	public static QuizDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new QuizDAOImpl();
	return instance;
}
	
	private QuizDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Quiz> selectALL(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> select(Connection conn, Allievo a) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> selectArg(Connection conn, String descrizione) throws Exception {
		
		String sql = "SELECT * FROM progetto_quiz.quiz inner join progetto_quiz.argomento"
				+ " On progetto_quiz.argomento.id=progetto_quiz.quiz.id_argomento "
				+ "where progetto_quiz.argomento.descrizione=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, descrizione);
		

		ResultSet rs = ps.executeQuery();

		List<Quiz> list = new ArrayList<>();

		while (rs.next()) {
			
			
			Quiz q = new Quiz(); 
			int id = rs.getInt("id");
			
			String difficolta = rs.getString("difficolta");

			q.setId(id);
			
			Argomento arg = new Argomento();
			arg.setDescrizione(descrizione);
			q.setArgomento (arg); 
			
			
			q.setDifficolta(difficolta);

			list.add(q);

		}

		conn.commit();
		return list;

	}
		
	

	@Override
	public Quiz select(Connection conn, int id) throws Exception {
		String sql = "SELECT * FROM quiz where id=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();

		Quiz q = new Quiz(); 

		while (rs.next()) {
//			dafinire

		}

		conn.commit();
		return q;
	}

	@Override
	public void insert(Connection conn, Quiz q) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Quiz q) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Connection conn, Quiz q) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Quiz> select(Connection conn, Argomento arg) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}