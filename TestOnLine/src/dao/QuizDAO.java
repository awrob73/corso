package dao;

import java.util.List;

import entity.Allievo;
import entity.Argomento;
import entity.Quiz;

public interface QuizDAO {
	public List<Quiz> selectALL() throws Exception;
	public List<Quiz> select(Allievo a) throws Exception;
	public List<Quiz> select(Argomento arg) throws Exception;
	public Quiz select(int id) throws Exception;
	

}
