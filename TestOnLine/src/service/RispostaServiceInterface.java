package service;

import java.util.List;

import entity.Domanda;
import entity.Risposta;

public interface RispostaServiceInterface {
	
	public List<Risposta> stampaRiposteDomanda(Domanda d) throws Exception;
	public Risposta stampaRispostaId(int id) throws Exception;

}
