package service;

import java.util.List;

import entity.Allievo;
import entity.Argomento;
import entity.Domanda;
import entity.Quiz;
import entity.Risposta;

public class QuizServiceImpl implements QuizServiceInterface {

	@Override
	public void registraQuiz(Quiz q) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Quiz> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> selectQuizAllievo(Allievo a) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quiz selectQuiz(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Argomento> selectAllArgomento() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> selectQuizArgomento(String argomento) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateQuiz(Quiz q) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQuiz(Quiz q) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Domanda> selectAllByQuiz(Quiz q) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Risposta> selectAllByDomanda(Domanda d) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
