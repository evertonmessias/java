package banco;

import java.sql.*;
import conexao.Conexao;

public class Apagar {
	public void apaga(int id) throws SQLException {
	    Connection conn = Conexao.getConnection();
	    String sql = "DELETE FROM pessoas WHERE id = '"+id+"'";
	    PreparedStatement stmt = conn.prepareStatement(sql);
	    //stmt.setInt(1,id);	    
	    stmt.execute();
	    stmt.close();		
	}
}
