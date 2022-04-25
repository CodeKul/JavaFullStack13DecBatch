package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * mysql> delimiter /
 * mysql> create procedure getAllRecords()
 *     -> begin
 *     -> select * from employee;
 *     -> end
 *     -> /
 * Query OK, 0 rows affected (0.01 sec)
 *
 *-------------------------------------------------
 * mysql> delimiter /
 * mysql> create procedure insertEmpRecords(IN e_id  bigint,IN e_name  text,IN e_age  bigint,IN e_email  text,
 *     -> IN e_mobile text)
 *     -> begin
 *     -> insert into employee(id,name,age,email,mobile) values(e_id,e_name,e_age,e_email,e_mobile);
 *     -> end
 *     -> /
 * Query OK, 0 rows affected (0.01 sec)
 */
public class MySqlProcedureDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java13Dec";
        String username = "root";
        String password = "Codekul@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
       // CallableStatement cs = con.prepareCall("{call getAllRecords()}");
       // Boolean result =  cs.execute();
       // System.out.println(result);
        CallableStatement cs = con.prepareCall("{call insertEmpRecords(?,?,?,?,?)}");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        cs.setInt(1,sc.nextInt());
        System.out.println("Enter name");
        cs.setString(2, sc.next());
        System.out.println("Enter Age");
        cs.setInt(3,sc.nextInt());
        System.out.println("Enter email");
        cs.setString(4, sc.next());
        System.out.println("Enter mobile");
        cs.setString(5, sc.next());
        boolean result = cs.execute();
        System.out.println(result);
        if (result)
            System.out.println("Data Added successfully");
        else
            System.out.println("Error occur");
    }
}
