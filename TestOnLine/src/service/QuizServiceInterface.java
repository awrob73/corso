package service;

import java.util.List;

import entity.Allievo;
import entity.Argomento;
import entity.Domanda;
import entity.Quiz;
import entity.Risposta;


public interface QuizServiceInterface {
	
	public void registraQuiz(Quiz q) throws Exception;
	
	public List<Quiz> selectAll() throws Exception;
	
	public List<Quiz> selectQuizAllievo(Allievo a) throws Exception;
	
	public Quiz selectQuiz(int id) throws Exception;
	
	public List<Argomento> selectAllArgomento() throws Exception;
	
	public List<Quiz> selectQuizArgomento(String argomento) throws Exception;
	
	public void updateQuiz(Quiz q) throws Exception;
	
	public void deleteQuiz(Quiz q) throws Exception;
	
	public List<Domanda> selectAllByQuiz(Quiz q) throws Exception;
	
	public List<Risposta> selectAllByDomanda(Domanda d) throws Exception;

}
