package com.company;
import java.util.Scanner;
class Patien{
    public void bmi(double weight, double height, String name) {
        double n;
        n = weight / (height * height);
        if (n < 18.5) {
            System.out.println(name + ", your bmi is " + n);
            System.out.println("Under weight");
        }
        else if(n>18.5 && n<24.5){
            System.out.println(name + ", your bmi is " + n);
            System.out.println("Normal  weight");
        }
        else if (n>25.0 && n<29.5){
            System.out.println(name + ", your bmi is " + n);
            System.out.println("Overweight  ");
        }
        else {
            System.out.println(name + ", your bmi is " + n);
            System.out.println("obese weight");
        }
    }
}
public class patients {
    public static void main(String[] args) {
        Patien pt= new Patien();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=in.next();
        System.out.println("Enter your height in meter");
        double height=in.nextDouble();
        System.out.println("Enter yor weight in kg");
        double weight= in.nextDouble();
        pt.bmi(weight , height, name);

    }
}
