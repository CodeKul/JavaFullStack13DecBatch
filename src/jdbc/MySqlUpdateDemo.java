package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlUpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java13Dec";
        String username = "root";
        String password = "Codekul@123";
        String query = "update employee set email=? where name=?;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement  ps = con.prepareStatement(query);
        ps.setString(1,"Yash@gmail.com");
        ps.setString(2,"Yash");
        int i = ps.executeUpdate();
        System.out.println(i +" row/s are affected");
        con.close();
    }
}
