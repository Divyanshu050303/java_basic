package com.company;
import java.util.*;
class useFullMethodOfArray{
    public void mai(){
//        allocate and initialize array
        int array[]=new int[10];
        for(int i =0;i<10;i++){
            array[i]=-3*i;
        }
//        display, sort, display
        System.out.println("The original array is");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted Array");
        display(array);
//        fill and display
        Arrays.fill(array, 2, 6, -1);
        System.out.println("After Fill():");
        display(array);
//        sort and display
        Arrays.sort(array);
        System.out.println("After sorting again: ");
        display(array);
//        binary search for -9
        System.out.println("The value -9 is at Location ");
        int index=Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
    public void display(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }

}
public class arrayss {
    public static void main(String[] args) {
        useFullMethodOfArray u=new useFullMethodOfArray();
        u.mai();
    }
}
