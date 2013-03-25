package struts.estudo.teste;

import java.sql.Connection;
import java.sql.SQLException;

import struts.estudo.dao.ConnectionFactory;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão ok");
		connection.close();
	}
}
