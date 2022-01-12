package DSA;
import java.util.Scanner;
class simpInsertion{
    public void display(int arr[], int size, int capacity) {// This function is use to display the array

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }


    }
    public int insert(int arr[], int size, int capacity, int index, int element){//This is the actual insertion function in this function we  insert the element in the specific
        // position
        if (size>=capacity){// In this if condition the capacity of array is less or equal the size then the function is return -1 and the function is to execute
            return -1;
        }
        for (int i = size; i >=index ; i--) {
            arr[i+1]=arr[i];//
        }
        arr[index]=element;

        return 1;
    }

}
public class simpleInsertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[];
        int capacity=100;
        arr=new int[capacity];
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the array elements in array");

            for (int i = 0; i < size; i++) {
                 arr[i]= sc.nextInt();
            }


        System.out.println("Enter the index which you want to insert the element ");
        int index=sc.nextInt();
        System.out.println("Enter the element which you want insert at "+index);
        int element=sc.nextInt();
        simpInsertion s=new simpInsertion();
        s.display(arr, size, 5);
        s.insert(arr, size, 100, index, element);
        System.out.println("After the insertion of element");
        s.display( arr, size+1, 5);


    }
}
