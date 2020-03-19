package dao;

import java.sql.Connection;
import java.util.List;

import entity.Argomento;

public interface ArgomentoDAO {
	public List<Argomento> selectAll(Connection conn) throws Exception;
	public Argomento select(Connection conn, int id) throws Exception;

}
