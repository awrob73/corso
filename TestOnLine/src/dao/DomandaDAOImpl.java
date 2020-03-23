package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Domanda;
import entity.Quiz;

public class DomandaDAOImpl implements DomandaDAO {

	private static DomandaDAOImpl instance;

	public static DomandaDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new DomandaDAOImpl();
	return instance;
}
	
	private DomandaDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Domanda> select(Connection conn, Quiz q) throws Exception {
		
		String sql = "SELECT * FROM DOMANDA WHERE ID_QUIZ = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, q.getId());
		ResultSet rs = ps.executeQuery();
		
		List<Domanda> list = new ArrayList<Domanda>();
		
		while(rs.next()) {
			Domanda d = new Domanda();
			int id = rs.getInt("id");
			String quesito = rs.getString("quesito");
			int numeroDomanda = rs.getInt("numero_domanda");
			d.setId(id);
			d.setQuiz(q);
			d.setQuesito(quesito);
			d.setNumeroDomanda(numeroDomanda);
			list.add(d);
		}
		
		conn.commit();
		return list;
	}

	@Override
	public Domanda select(Connection conn, int id) throws Exception {
		
		String sql = "SELECT * FROM DOMANDA WHERE ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Quiz q = new Quiz();
		Domanda d = new Domanda();
		
		while(rs.next()) {
			int idDomanda = rs.getInt("id");
			q.setId(rs.getInt("id_quiz"));
			String quesito = rs.getString("quesito");
			int numeroDomanda = rs.getInt("numero_domanda");
			d.setId(id);
			d.setQuiz(q);
			d.setQuesito(quesito);
			d.setNumeroDomanda(numeroDomanda);
		}
		
		return d;
	}

	@Override
	public void insert(Connection conn, Domanda d) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Domanda d) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Connection conn, Domanda d) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Domanda> selectAll(Connection conn) throws Exception {
		
		String sql = "SELECT * FROM DOMANDA";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<Domanda> list = new ArrayList<Domanda>();
		
		while(rs.next()) {
			Domanda d = new Domanda();
			int id = rs.getInt("id");
			int idQuiz = rs.getInt("id_quiz");
			String quesito = rs.getString("quesito");
			int numeroDomanda = rs.getInt("numero_domanda");
			d.setId(id);
			d.getQuiz().setId(idQuiz);
			d.setQuesito(quesito);
			d.setNumeroDomanda(numeroDomanda);
			list.add(d);
		}
		
		conn.commit();
		return list;
	}
	}


