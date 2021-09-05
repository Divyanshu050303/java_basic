// this program convert the uppercase letter in to lowercase letter
package com.company;
import java.util.Scanner;
class convert{
    String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str= sc.nextLine();
    }
    public void print(){
        System.out.println("Here is your string ");
        System.out.println(str.toLowerCase());
    }
}
public class convert_the_letter_in_lowercase {
    public static void main(String[] args) {
        convert cn=new convert();
        cn.input();
        cn.print();
    }
}
