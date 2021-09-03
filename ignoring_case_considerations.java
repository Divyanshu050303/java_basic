// this program work on ignoring case considerations
package com.company;
import java.util.Scanner;
class cone{
    String str1, str2;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string ");
        str1= sc.nextLine();
        System.out.println("Enter the second string ");
        str2=sc.nextLine();
    }
    public void print(){
        boolean kam=str1.equalsIgnoreCase(str2);
        System.out.println(kam);
    }
}
public class ignoring_case_considerations {
    public static void main(String[] args) {
        cone ct=new cone();
        ct.input();
        ct.print();
    }
}
