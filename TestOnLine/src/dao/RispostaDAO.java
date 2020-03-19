package dao;

import java.sql.Connection;
import java.util.List;

import entity.Domanda;
import entity.Risposta;

public interface RispostaDAO {
	public List<Risposta> select(Connection conn, Domanda d) throws Exception;
	public Risposta select(Connection conn, int id) throws Exception;
	

}
