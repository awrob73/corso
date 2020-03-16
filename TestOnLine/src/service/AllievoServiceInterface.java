package service;

import entity.Allievo;

public interface AllievoServiceInterface {
	
	public void registraAllievo(Allievo a) throws Exception;
	public Allievo leggiDatiAllievo(String username) throws Exception;
	public void cancellaAllievo(String username) throws Exception;
	public void modificaPasswordAllievo(Allievo a, String newPass) throws Exception;
	public void modificaNomeAllievo(Allievo a, String newNome) throws Exception;
	public void modificaCognomeAllievo(Allievo a, String newCognome) throws Exception;
	public void modificaEmailAllievo(Allievo a, String newEmail) throws Exception;
	

}
