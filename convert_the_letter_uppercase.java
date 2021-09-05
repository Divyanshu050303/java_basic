// this program convert the lowercase letter in to uppercase letter
package com.company;
import java.util.Scanner;
class conver{
    String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str= sc.nextLine();
    }
    public void print(){
        System.out.println("Here is your string ");
        System.out.println(str.toUpperCase());
    }
}
public class convert_the_letter_uppercase {
    public static void main(String[] args) {
        conver cn=new conver();
        cn.input();
        cn.print();
    }
}
