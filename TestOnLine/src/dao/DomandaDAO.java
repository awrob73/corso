package dao;

import java.util.List;

import entity.Domanda;
import entity.Quiz;

public interface DomandaDAO {
	public List<Domanda> select(Quiz q) throws Exception;
	public Domanda select(int id) throws Exception;

}
