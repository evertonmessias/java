package banco;

import java.sql.*;
import java.util.ArrayList;
import conexao.Conexao;

public class Consultar {

	public ArrayList<DadosPessoais> getLista() throws SQLException {
		try {
			Connection con = Conexao.getConnection();
			String sql = "SELECT * FROM pessoas";
			PreparedStatement prepara = con.prepareStatement(sql);
			ResultSet consulta = prepara.executeQuery();
			ArrayList<DadosPessoais> lista = new ArrayList<DadosPessoais>();

			while (consulta.next()) {
				DadosPessoais pessoa = new DadosPessoais();
				pessoa.setId(consulta.getInt("id"));
				pessoa.setNome(consulta.getString("nome"));
				pessoa.setTelefone(consulta.getString("telefone"));
				pessoa.setEmail(consulta.getString("email"));
				lista.add(pessoa);
			}
			consulta.close();
			prepara.close();
			return lista;
		} catch (SQLException e) {
			throw e;
		}
	}

}
