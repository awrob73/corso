package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class SingletonConnection {

	private static Connection conn;
	
	private SingletonConnection() throws Exception {
		
		//costruire l'oggetto conn
		//prendendo i dati dal file properties
		
		ResourceBundle rb = ResourceBundle.getBundle("dao/jdbc"); //non scrivo info.properties perchè non è necessario visto che getBundle può aprire solo file .properties
		
		//devo collegare le chiavi, tra le "" ci stanno i nomi delle chiavi (a sx del =) nel file properties
		
		String username = rb.getString("user");
		String psw = rb.getString("password");
		String url = rb.getString("url");
		String driverName = rb.getString("DriverClassName");
		
		Class.forName(driverName);
		conn = DriverManager.getConnection(url, username, psw);
	
		conn.setAutoCommit(false); //voglio fare le connessioni a mano
					
	}
	
	
	public static Connection getConnection() throws Exception {
		
		if(conn==null) new SingletonConnection(); //questo garantisce che l'oggetto conn sia uno ed uno solo quindi un'unica connessione
		
		return conn;
	}
}
