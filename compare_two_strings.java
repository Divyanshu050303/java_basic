package com.company;
import java.util.Scanner;
class compare{
    String str1, str2;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        str1=sc.nextLine();
        System.out.println("Enter the second string ");
        str2= sc.nextLine();
    }
    public void print(){
        System.out.println(str1.compareTo(str2));
    }
}
public class compare_two_strings {
    public static void main(String[] args) {
        compare cm=new compare();
        cm.input();
        cm.print();

    }
}
