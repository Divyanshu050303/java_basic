package com.company;
import java.util.Scanner;
class unicod{
    int n, m;
    String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        str= sc.nextLine();
        System.out.println("Enter the initial index ");
        n= sc.nextInt();
        System.out.println("Enter the ending index");
        m= sc.nextInt();
    }
    public void print(){
        int c=str.codePointCount(n, m);;;;;
        System.out.println("This is the number of character present between the range "+c);
    }
}
public class character_between_specific_range {
    public static void main(String[] args) {
        unicod un=new unicod();
        un.input();
        un.print();
    }
}
