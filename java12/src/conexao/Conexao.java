package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static String db = "jdbc:mysql://localhost/teste";
	private static String user = "root";
	private static String pass = "efc2505xx";	

	public static Connection getConnection() throws SQLException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(db, user, pass);

		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());

		}
	}

}
