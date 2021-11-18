package oops_lab;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int  []array=new int[n];
        System.out.println("Enter the element in the array");
        try {
            for (int i = 0; i < n; i++){
                array[i]=Integer.parseInt(sc.next());
            }
            int pos;
            System.out.println("Enter the index of the element which you want:");
            pos=sc.nextInt();
            System.out.println("the array element at this index"+pos+"="+array[pos]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("index out of range:"+a);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}