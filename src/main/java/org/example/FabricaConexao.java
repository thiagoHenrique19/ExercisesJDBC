package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    public static Connection getConexao() {
        try {
            String driver = "org.postgresql.Driver";
            final String url = "jdbc:postgresql://localhost:5432/teste_curso";
            final String usuario = "postgres";
            final String senha = "1234";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }
}
