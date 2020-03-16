package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class Alterar {
	public void altera(int id, String usuario,String email,String tel) throws SQLException {
	    Connection conn = Conexao.getConnection();	    
	    String sql = "UPDATE pessoas SET nome = '"+usuario+"', email = '"+email+"' , telefone = '"+tel+"' WHERE id = '"+id+"'";
	    PreparedStatement stmt = conn.prepareStatement(sql);   
	    stmt.execute();
	    stmt.close();		
	}
}
