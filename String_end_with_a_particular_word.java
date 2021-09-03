package com.company;
import java.util.Scanner;
class ends{
    String str1, str2;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        str1=sc.nextLine();
        System.out.println("Enter the check the character ");
        str2=sc.nextLine();
    }
    public void print(){
        System.out.println(str1.endsWith(str2));
    }
}
public class String_end_with_a_particular_word {
    public static void main(String[] args) {
        ends en=new ends();
        en.input();
        en.print();
    }
}
