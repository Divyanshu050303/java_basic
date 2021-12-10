import java.util.*;

public class SwapList 
{
    void func()
    {
        List ls=new ArrayList();
        
        ls.add("Mango");
        ls.add("Apple");
        ls.add("Grapes");
        ls.add("Orange");
        ls.add("Banana");
        ls.add("Pomegranate");
        
        System.out.println(ls);
        
        System.out.println("No of Elements : "+ls.size());
        
        System.out.println("\n---------------------------------------\n");
        
        Collections.swap(ls,0,5);
        
        System.out.println("After Swapping : "+ls);
        
        System.out.println("No of Elements : "+ls.size());
    }
    public static void main(String args[])
    {
        SwapList obj=new SwapList();
        obj.func();
    }
}
