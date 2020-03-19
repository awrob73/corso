package dao;

import java.sql.Connection;
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
	public List<Quiz> select(Connection conn, Argomento arg) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quiz select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
