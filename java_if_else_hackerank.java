package com.company;
import java.util.Scanner;
public class java_if_else_hackerank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%2==1 || (n>=6 && n <= 20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
