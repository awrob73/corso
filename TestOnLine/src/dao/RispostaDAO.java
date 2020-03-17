package dao;

import java.util.List;

import entity.Domanda;
import entity.Risposta;

public interface RispostaDAO {
	public List<Risposta> select(Domanda d) throws Exception;
	public Risposta select(int id) throws Exception;
	

}
