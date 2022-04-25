package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * instead of executing a single query, execute a batch(group) of queries
 */
public class MysqlBatchProcessingDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java13Dec";
        String username = "root";
        String password = "Codekul@123";
        String query1 = "insert into employee values(7,'Vishwesh',40,'vish@gmail.com','5363412588');";
        String query2 = "insert into employee values(8,'Gauri',40,'gauri@gmail.com','5363412535');";
        String query3 = "insert into employee values(9,'Nitin',40,'nitin@gmail.com','5363462588');";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query3);
        st.executeBatch();
        con.close();
    }
}
