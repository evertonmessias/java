package banco;

import java.sql.*;
import conexao.Conexao;

public class Apagar {	
	public boolean apaga(int id)throws SQLException  {		
		try {
			Connection con = Conexao.getConnection();
			String sql = "DELETE FROM pessoas WHERE id = '" + id + "'";
			PreparedStatement prepara = con.prepareStatement(sql);
			prepara.executeQuery();
			return true;
		} catch (SQLException e) {
			throw e;			
		}
	}
}

