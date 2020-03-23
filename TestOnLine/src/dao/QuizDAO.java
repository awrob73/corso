package dao;

import java.sql.Connection;
import java.util.List;

import entity.Allievo;
import entity.Argomento;
import entity.Quiz;

public interface QuizDAO {
	public List<Quiz> selectALL(Connection conn) throws Exception;
	public List<Quiz> select(Connection conn,Allievo a) throws Exception;
	public List<Quiz> select(Connection conn,Argomento arg) throws Exception;
	public Quiz select(Connection conn,int id) throws Exception;
	public void insert(Connection conn, Quiz q) throws Exception;
	public void delete(Connection conn, Quiz q) throws Exception;
	public void update(Connection conn, Quiz q) throws Exception;
	

}
