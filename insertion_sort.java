package DSA;
import java.util.Scanner;
class insertion{
    public void Insert(int []array, int n){
        for(int i=1;i<n;i++){
            int key=array[i];
            int j=i-1;
            while (j>=0 && array[j]>key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j+1]=key;
        }
        System.out.println("After the insertion sort the array is...");
        for (int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();
        int []array=new int[n];
        System.out.println("Enter the element in the array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        insertion in=new insertion();
        in.Insert(array, n);
    }
}
