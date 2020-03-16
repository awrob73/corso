package service;

import java.util.List;

import entity.Allievo;
import entity.Quiz;


public interface QuizServiceInterface {
	
	public void registraQuiz(Quiz q);
	public List<Quiz> selectAll();
	public List<Quiz> selectQuizAllievo(Allievo a);
	public Quiz select(int id);
	public List<Quiz> selectQuizArgomento(String argomento);
	public void update(Quiz q);
	public void delete(Quiz q);

}
