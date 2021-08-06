package com.company;
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter the age");
        age= sc.nextInt();
        if (age>18) {
            System.out.println("You are able to vote");
        }
        else {
            System.out.println("Sorry you are not 18 now");
        }
    }
}
