import java.sql.*;
public class stu{
    Connection con;
    stu(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            System.out.println("Connection success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        stu t=new stu();
    }
}