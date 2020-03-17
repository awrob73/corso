package dao;

import java.util.List;

import entity.Allievo;

public interface AllievoDAO {
	public Allievo select(String username) throws Exception;
	public List<Allievo> selectAll() throws Exception;
	public void insert(Allievo a) throws Exception;
	public void delete(String username) throws Exception;
	public void update(Allievo a) throws Exception;
}
