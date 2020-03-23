package service;

import java.util.List;

import entity.Argomento;

public interface ArgomentoServiceInterface {
	
	public List<Argomento> getTuttiArgomenti() throws Exception;
	
	public void cercaArgomento(String descrizione) throws Exception; 
		
	
}