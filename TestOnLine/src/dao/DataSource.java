package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DataSource {
	private static DataSource instance;
	
	private String username;
	private String psw;
	private String url;
	
	private DataSource() throws Exception {
		
		//costruire l'oggetto conn
		//prendendo i dati dal file properties
		
		ResourceBundle rb = ResourceBundle.getBundle("dao/jdbc"); //non scrivo info.properties perchè non è necessario visto che getBundle può aprire solo file .properties
		
		//devo collegare le chiavi, tra le "" ci stanno i nomi delle chiavi (a sx del =) nel file properties
		
		username = rb.getString("user");
		psw = rb.getString("password");
		url = rb.getString("url");
		String driverName = rb.getString("DriverClassName");
		
		Class.forName(driverName);

					
	}
	
	
	public Connection getConnection() throws Exception {
		
		Connection conn = DriverManager.getConnection(url, username, psw);
		
		if(conn==null) instance.getConnection(); //questo garantisce che l'oggetto conn sia uno ed uno solo quindi un'unica connessione
		conn.setAutoCommit(false); //voglio fare le connessioni a mano 
		return conn;
	}


	public static DataSource getInstance() throws Exception{
		if(instance==null) instance=new DataSource();
		return instance;
	}


	
}
