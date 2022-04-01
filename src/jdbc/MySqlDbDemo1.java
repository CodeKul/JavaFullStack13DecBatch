package jdbc;

import java.sql.*;

public class MySqlDbDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java13Dec";
        String username = "root";
        String password = "Codekul@123";
        String query = "select * from employee";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Integer id = rs.getInt(1);
            String name = rs.getString(2);
            Integer age = rs.getInt(3);
            String email = rs.getString(4);
            String mobile = rs.getString(5);
            System.out.println("*******Employee Details*******");
            System.out.println("ID " + id);
            System.out.println("Name " + name);
            System.out.println("Age " + age);
            System.out.println("Email " + email);
            System.out.println("Mobile " + mobile);
        }
        con.close();

    }
}
