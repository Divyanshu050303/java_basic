package com.company;
import java.util.Scanner;
class unicode{
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
        System.out.println("This is the unicode of given index "+str.codePointAt(n));
    }
}
public class unicode_or_given_index {
    public static void main(String[] args) {
        unicode un=new unicode();
        un.input();
        un.print();
    }
}
