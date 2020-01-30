package dbconnection;

import java.sql.*;

public class DBConnect {
    private String url="jdbc:mysql://localhost:3306/universitymanagementsystem";
    private String user="root";
    private String pass="root";
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }

    public void closeConnection(ResultSet rs,Connection conn) throws SQLException {
        rs.close();
        conn.close();
    }
}
