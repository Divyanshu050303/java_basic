package com.company;
import java.util.Scanner;
class specific{
    private int num1, num2, n;
    private int []array=new int[50];
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        System.out.println("Enter the first number");
        num1= sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        System.out.println("Enter the element in the array");
        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
    }
    public void print(){
        int c=0, i;
        for(i=0;i<n;i++){
            if(array[i]==num1 ||array[i]==num2){
                c++;
            }
        }
        if(c==2){
            System.out.println("Both the number is present in the array");
        }
        else if(c==1){
            System.out.println("Only one number present in the array");
        }
        else{
            System.out.println("both the number is not present in the array");
        }
    }
}
public class two_specific_number_contain_array {
    public static void main(String[] args) {
        specific sf=new specific();
        sf.input();
        sf.print();
    }
}
