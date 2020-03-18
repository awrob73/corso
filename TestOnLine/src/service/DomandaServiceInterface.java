package service;

import java.util.List;

import entity.Domanda;
import entity.Quiz;

public interface DomandaServiceInterface {
	
	public Domanda leggiDomanda(int id) throws Exception;
	
	public List<Domanda> stampaDomandeQuiz(Quiz q) throws Exception;
	
	public List<Domanda> stampaDomande() throws Exception;
	
	
	

}
