package dao;

import java.sql.Connection;
import java.util.List;

import entity.AllievoQuiz;

public class AllievoQuizDAOImpl implements AllievoQuizDAO {
	
private static AllievoQuizDAOImpl instance;

	public static AllievoQuizDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new AllievoQuizDAOImpl();
	return instance;
}
	
	private AllievoQuizDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public AllievoQuiz select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AllievoQuiz> selectAll(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AllievoQuiz> selectAllbyAllievo(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Insert(Connection conn, AllievoQuiz aq) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Connection conn, AllievoQuiz aq) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Connection conn, AllievoQuiz aq) throws Exception {
		// TODO Auto-generated method stub

	}

}
