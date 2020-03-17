package dao;

import java.util.List;

import entity.Argomento;

public interface ArgomentoDAO {
	public List<Argomento> selectAll() throws Exception;
	public Argomento select(int id) throws Exception;

}
