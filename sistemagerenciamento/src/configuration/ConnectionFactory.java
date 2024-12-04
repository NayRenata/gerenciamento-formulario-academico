package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection recuperarConexao() {
		String user = "root";
		String password = "root";
		
		try {
			return DriverManager
					.getConnection("jdbc:mysql://localhost:3306/db_faculdade?user=" + user + "&password=" + password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}