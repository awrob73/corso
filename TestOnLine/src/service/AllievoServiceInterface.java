package service;

import entity.Allievo;

public interface AllievoServiceInterface {
	
	public void registraAllievo(Allievo a) throws Exception;
	
	public Allievo leggiDatiAllievo(String username) throws Exception;
	
	public void cancellaAllievo(String username) throws Exception;
	
	public void modificaPassword(Allievo a, String newPass) throws Exception;
	
	public void modificaNome(Allievo a, String newNome) throws Exception;
	
	public void modificaCognome(Allievo a, String newCognome) throws Exception;
	
	public void modificaEmail(Allievo a, String newEmail) throws Exception;
	
	public void modificaStato(Allievo a, String newStato) throws Exception;
	
	

}
