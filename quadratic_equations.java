package com.company;
import java.util.Scanner;
public class quadratic_equations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter the value of a :");
        a=sc.nextDouble();
        System.out.print("Enter the value of b");
        b=sc.nextDouble();
        System.out.print("Enter the value of c");
        c=sc.nextDouble();
        double result=b*b-4.0*a*c;
        if(result>0.0){
            double r1=(-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("This are the root "+r1+" and "+r2);
        }
        else if(result==0.0){
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);

        }
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}
