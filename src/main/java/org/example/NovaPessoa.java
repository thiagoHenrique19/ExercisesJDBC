package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        System.out.println(nome);

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
      //caso queira botar a pessoa em um local especifico é so definir o seu local abaixo
        //  stmt.setInt(2,100);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso");
        entrada.close();
    }
}
