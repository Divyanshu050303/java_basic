package com.company;
import java.util.Scanner;
class index{
    int n;
    String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str= sc.nextLine();
        System.out.println("Enter the index");
        n=sc.nextInt();
    }
    public void print(){
        System.out.println("The character at your given index  "+str.charAt(n));
    }
}
public class get_the_character_at_the_given_index {
    public static void main(String[] args) {
        index in=new index();
        in.input();
        in.print();
    }
}
