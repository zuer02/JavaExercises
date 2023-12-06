package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {

    private static Banco instancia = null;
    private Connection conn;

    

    private Banco() throws SQLException, ClassNotFoundException{
        String url = "jdbc:postgresql://localhost:5432/testeDB";
        Class.forName("org.postgres.Driver");
        conn = DriverManager.getConnection(url, "postgres", "123");
    }

    public static Banco getInstancia() throws SQLException, ClassNotFoundException {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public Connection getConnection() {
        return conn;
    }
    
}
