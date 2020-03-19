package dao;

import java.sql.Connection;
import java.util.List;

import entity.Allievo;

public interface AllievoDAO {
	public Allievo select(Connection conn,String username) throws Exception;
	public List<Allievo> selectAll(Connection conn) throws Exception;
	public void insert(Connection conn,Allievo a) throws Exception;
	public void delete(Connection conn,String username) throws Exception;
	public void update(Connection conn,Allievo a) throws Exception;
}
