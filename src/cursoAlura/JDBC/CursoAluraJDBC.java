package cursoAlura.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CursoAluraJDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/world?useTimezone=true&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        System.out.println("Fechando conexão");
        connection.close();
    }
}
