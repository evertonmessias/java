package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class Inserir {
	public void inseri(String usuario,String email,String tel) throws SQLException {
	    Connection conn = Conexao.getConnection();	    
	    String sql = "INSERT INTO pessoas VALUES (DEFAULT,'"+usuario+"','"+email+"','"+tel+"')";
	    PreparedStatement stmt = conn.prepareStatement(sql);   
	    stmt.execute();
	    stmt.close();		
	}
}
