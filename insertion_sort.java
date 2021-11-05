package DSA;
import java.util.Scanner;
class insertion{
    public void Insert(int []a, int n){
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while (j>0 && a[j]>key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j+1]=key;
        }
        System.out.println("After the insertion sort the array is...");
        for (int i=0; i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();
        int []arrya=new int[n];
        System.out.println("Enter the element in the array");
        for(int i=0;i<n;i++){
            arrya[i]=sc.nextInt();
        }
        insertion in=new insertion();
        in.Insert(arrya, n);
    }
}
