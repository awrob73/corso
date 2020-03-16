package service;

import java.util.List;

import entity.Allievo;


public interface QuizServiceInterface {
	
	public void registraUtente(Allievo a) throws Exception;
	public Allievo leggiDatiUtente(String username) throws Exception;
	public void cancellaUtente(String username) throws Exception;
	public void modificaPasswordUtente(String username, String newPass) throws Exception;
	

}
