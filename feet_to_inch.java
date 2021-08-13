//This program convert centimeter to inch and feet
package com.company;
import java.util.Scanner;
public class feet_to_inch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n,m, k;
        System.out.println("Enter height in  Centimeter");
        n=sc.nextFloat();
        m=n*0.032f;
        k=n*0.393f;
        System.out.println("Height in feet" +m);
        System.out.println("Height in inches" +k);
    }
}
