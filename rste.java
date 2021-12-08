import java.util.*;
import java.sql.*;
public class rste extends stu
{
    void insert()
    {
        try
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter employee id ");
            int id=sc1.nextInt();

            System.out.println("Enter employee name ");
            String name=sc1.next();

            String insertquerry="insert into employee values(?,?);";

            PreparedStatement pst=con.prepareStatement(insertquerry);

            pst.setInt(1, id);
            pst.setString(2,name);

            pst.executeUpdate();
            System.out.println("data inserteddd...................");
        }
        catch(Exception e)
        {
            System.out.println("");
        }
    }
    void delete()
    {
        try
        {
            int id=2;
            String delquery="delete from employee where id="+id;

            //String course="BCA";
            // String delquery="delete from student where scourse='"+course+"'";

            PreparedStatement pst2=con.prepareStatement(delquery);

            pst2.executeUpdate();

            System.out.println("data deleteddddddddddddd....");
        }
        catch(Exception e)
        {
            System.out.println("not deleteddd..."+e);
        }
    }
    void view()
    {
        try
        {
            String viewquery="select * from employee";

            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(viewquery);

            while(rs.next())
            {
                System.out.print(" "+rs.getInt(1));
                System.out.print(" "+rs.getString(2));
                System.out.print("\n");
            }

            System.out.println("view fn working ");
        }
        catch(Exception e)
        {
            System.out.println("");
        }
    }
    void update()
    {
        try
        {
            System.out.println("update fn working ");
        }
        catch(Exception e)
        {
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        rste obj = new rste();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for view");
            System.out.println("Press 4 for update");
            System.out.println("Press 5 for Exit");

            System.out.println("\nEnter ur choice ");
            Scanner sc1 = new Scanner(System.in);
            int choice = sc1.nextInt();

            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    obj.update();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice ");
            }
        }
    }
}

