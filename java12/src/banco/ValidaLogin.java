package banco;

import java.sql.*;
import conexao.Conexao;

public class ValidaLogin {
	
	public boolean validar(String usuario, String senha)throws SQLException  {
		try {
			Connection con = Conexao.getConnection();
			String sql = "SELECT * FROM users WHERE name='" + usuario + "' AND pass='" + senha + "'";
			PreparedStatement prepara = con.prepareStatement(sql);
			ResultSet consulta = prepara.executeQuery();
			if (consulta.next()) {					
				con.close();
				return true;
			} else {					
				con.close();
				return false;
			}
		} catch (SQLException e) {
			throw e;
		}
	}	

}
