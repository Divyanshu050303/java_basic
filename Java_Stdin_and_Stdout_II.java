package com.company;
import java.util.Scanner;
public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        double m= sc.nextDouble();
        String s= sc.nextLine();
        System.out.print("String: "+s);
        System.out.println();
        System.out.println("Double: "+m);
        System.out.println("Int: "+n);
    }
}
