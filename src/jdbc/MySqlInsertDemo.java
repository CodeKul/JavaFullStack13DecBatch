package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlInsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java13Dec";
        String username = "root";
        String password = "Codekul@123";
        String query = "insert into employee values(?,?,?,?,?);";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement  ps = con.prepareStatement(query);
        ps.setInt(1,4);
        ps.setString(2,"Yash");
        ps.setInt(3,26);
        ps.setString(4,"yash@codekul.com");
        ps.setString(5,"9856342578");
        int i = ps.executeUpdate();
        System.out.println(i +" row/s are affected");
        con.close();
    }
}
