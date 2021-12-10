import java.util.*;

public class SortList 
{
    void func()
    {
         List ls=new ArrayList();
         
         ls.add(56);
         ls.add(45);
         ls.add(2);
         ls.add(22);
         ls.add(39);
         ls.add(100);
         ls.add(89);
         ls.add(1);
         ls.add(78);
         ls.add(17);
         
         System.out.println(ls);
         System.out.println("No of Element : "+ls.size());
         
         Collections.sort(ls);
         
         System.out.println("\n-------------------------------\n");
         
        System.out.println("After Sorting : "+ls);
        System.out.println("No of Element : "+ls.size());
    }
    public static void main(String args[])
    {
      SortList obj=new SortList();
      obj.func();
    }
}
