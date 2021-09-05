// this program find the missing number in the array
package com.company;
import java.util.Arrays;
import java.util.Scanner;
class missing{
    int i, n;
    int []array=new int[50];
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        System.out.println("Enter the element in the array");
        for (i=0;i<n-1;i++){
            array[i]=sc.nextInt();
        }
    }
    public void print(){
        int num=n*((n+1)/2);
        System.out.println("Missing number "+(num- Arrays.stream(array).sum()));
    }
}
public class missing_number_in_an_array {
    public static void main(String[] args) {
        missing ms=new missing();
        ms.input();
        ms.print();
    }
}
