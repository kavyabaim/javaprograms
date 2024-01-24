package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	static Connection connection;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		if(connection == null) {
			//register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch10742","root","123456");
			return connection;
		}
		else {
			return connection;
		}
	}
		
}
