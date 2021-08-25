package com.company;
import java.util.Scanner;
public class hexagon_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of side of hexagon");
        double s= sc.nextDouble();
        System.out.println("The area of hexagon is "+ (6*(s*s))/(4*Math.tan(Math.PI/6)));
    }
}
