// this program convert fahrenheit to celsius
package com.company;
import java.util.Scanner;
public class Fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n, m;
        System.out.println("Enter the temperature in fahrenheit");
        n= sc.nextFloat();
        m=0.556f*(n-32);
        System.out.println("This your temperature in celsius" +m);
    }
}
