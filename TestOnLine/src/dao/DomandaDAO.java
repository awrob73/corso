package dao;

import java.sql.Connection;
import java.util.List;

import entity.Domanda;
import entity.Quiz;

public interface DomandaDAO {
	public List<Domanda> selectAll(Connection conn) throws Exception;
	public List<Domanda> select(Connection conn, Quiz q) throws Exception;
	public Domanda select(Connection conn, int id) throws Exception;
	public void insert(Connection conn, Domanda d) throws Exception;
	public void delete(Connection conn, Domanda d) throws Exception;
	public void update(Connection conn, Domanda d) throws Exception;

}
