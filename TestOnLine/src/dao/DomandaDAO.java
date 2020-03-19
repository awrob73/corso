package dao;

import java.sql.Connection;
import java.util.List;

import entity.Domanda;
import entity.Quiz;

public interface DomandaDAO {
	public List<Domanda> select(Connection conn, Quiz q) throws Exception;
	public Domanda select(Connection conn, int id) throws Exception;

}
