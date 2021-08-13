// This program convert celsius to fahrenheit
package com.company;
import java.util.Scanner;
public class celsius_fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n, m;
        System.out.println("Enter the temperature in celsius");
        n=sc.nextFloat();
        m=1.8f*n+32;
        System.out.println("This is the temperature in fahrenheit "+m);

    }
}
