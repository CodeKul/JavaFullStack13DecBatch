package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlDeleteDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java13Dec";
        String username = "root";
        String password = "Codekul@123";
        String query = "delete from employee where id = ?;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,4);
        int i = ps.executeUpdate();
        System.out.println(i +" row/s are affected");
        con.close();
    }
}
