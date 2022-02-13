package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int numberOfInput=sc.nextInt();
        for (int i = 0; i <numberOfInput ; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            if(a*b<=x*y)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }

        }
    }
}
