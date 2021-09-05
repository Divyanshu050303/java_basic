// this program trim the whitespace  
package com.company;
import java.util.Scanner;
class leading{
    String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str= sc.nextLine();
    }
    public void print(){
        System.out.println("Original string ");
        System.out.println(str);
        System.out.println("New string after trim the string");
        System.out.println(str.trim());
    }
}
public class leading_whiteshape {
    public static void main(String[] args) {
        leading ld=new leading();
        ld.input();
        ld.print();
    }
}
