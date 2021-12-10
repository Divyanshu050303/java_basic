import java.util.*;

class SortedList 
{
    void func()
    {
        List ls=new ArrayList();
        ls.add("Mango");
        ls.add("Apple");
        ls.add("Grapes");
        ls.add("Orange");
        ls.add("Banana");
        
        System.out.println(ls);
        System.out.println("No of Element : "+ls.size());
        
        System.out.println("\n\n--------------------------------------\n\n");
        
        Collections.sort(ls);
        
        System.out.println("After sorting : " +ls);
        System.out.println("No of Element : "+ls.size());
        
    }
    public static void main(String args[])
    {
        SortedList obj=new SortedList();
        obj.func();
    }
    
}
