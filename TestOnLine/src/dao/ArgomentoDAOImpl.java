package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Argomento;

public class ArgomentoDAOImpl implements ArgomentoDAO {

	private static ArgomentoDAOImpl instance;

	public static ArgomentoDAOImpl getInstance() throws Exception {
		if(instance==null) instance=new ArgomentoDAOImpl();
	return instance;
}
	
	private ArgomentoDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
public List<Argomento> selectAll(Connection conn) throws Exception {
		
		String sql = "select * from argomento";
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Argomento> list = new ArrayList<>();

		while (rs.next()) {
			Argomento arg = new Argomento();
			int id = rs.getInt("id");
			String descrizione = rs.getString("descrizione");

			arg.setId(id);
			arg.setDescrizione(descrizione);

			list.add(arg);

		}

		conn.commit();
		return list;

	}

	@Override
	public Argomento select(Connection conn, int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Insert(Connection conn, Argomento arg) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Connection conn, Argomento arg) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Argomento arg) throws Exception {
		// TODO Auto-generated method stub
		
	}

}



