import java.sql.*;

public class IjdbcExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab26/11","root","")  ;
        Statement s =con.createStatement();
        ResultSet rs =s.executeQuery("select *from student");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getInt(3));
        }
        con.close();
    }
}
