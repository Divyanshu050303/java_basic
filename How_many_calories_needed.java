//this program calculate calories per day you needed
package com.company;
import java.util.Scanner;
public class How_many_calories_needed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n, m;
        String s;
        System.out.println("Enter your name");
        s=sc.next();
        System.out.println("Enter your weight ");
        n= sc.nextFloat();
        m=n*19;
        System.out.println(s+", You need "+m+" calories in a day");

    }
}
