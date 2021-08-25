package com.company;
import java.util.Scanner;
public class reverese_the_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        String s1="";
        int i, n;
        n= s.length();
        for (i =n-1; i>=0; i--){
            s1+=s.charAt(i);
        }
        System.out.println("The reverse string is "+ s1);
    }
}
