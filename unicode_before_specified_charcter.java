package com.company;
import java.util.Scanner;
class unico{
    int n;
    String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        str= sc.nextLine();
        System.out.println("Enter the index ");
        n= sc.nextInt();
    }
    public void print(){
        System.out.println("This is the unicode of given index "+str.codePointAt(n-1));
    }
}
public class unicode_before_specified_charcter {
    public static void main(String[] args) {
        unico sc=new unico();
        sc.input();
        sc.print();
    }
}
