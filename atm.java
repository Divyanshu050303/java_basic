package com.company;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ac, pin, u, i=0, t;
        float a=0, b, c, d;
        System.out.println("Welcome to the atm");
        System.out.println("Enter your account number");
        ac= sc.nextInt();
        System.out.println("Enter you Pin ");
        pin= sc.nextInt();
        while (i<=11){
            System.out.println("1 : checking account \n 2 : Saving account \n 3 : exit");
            t= sc.nextInt();
            if (t==1) {
                System.out.println("Checking account");
                System.out.println("1: View Balance \n 2 : Deposit fund \n 3 : Withdrow fund \n 4 : exit");
                u = sc.nextInt();
                if (u == 1) {

                    System.out.println("Checking account balance" + a);
                } else if (u == 2) {
                    System.out.println("Amount you want to deposit from checking account");
                    b = sc.nextFloat();
                    c = a + b;
                    System.out.println("New checking amount" + c);
                    d = a;
                    a = c;
                    c = d;
                } else if (u == 3) {
                    System.out.println("Checking amount Balances " + a);
                    System.out.println("Amount you want to withdrow from checking account");
                    b = sc.nextFloat();
                    c = a - b;
                    System.out.println("Now your checking account balances" + c);
                } else if (u == 4) {
                    System.out.println("Thank you to using atm");
                    break;
                } else {
                    System.out.println("Sorry you enter something wrong");
                }
            }
            else if (t==2){
                System.out.println("Saving account");
                System.out.println("1: View Balance \n 2 : Deposit fund \n 3 : Withdrow fund \n 4 : exit");
                u = sc.nextInt();
                if (u == 1) {

                    System.out.println("Saving account balance" + a);
                } else if (u == 2) {
                    System.out.println("Saving account balance" + a);
                    System.out.println("Amount you want to deposit from saving account");
                    b = sc.nextFloat();
                    c = a + b;
                    System.out.println("New Saving amount" + c);
                    d = a;
                    a = c;
                    c = d;
                } else if (u == 3) {
                    System.out.println("Saving amount Balances " + a);
                    System.out.println("Amount you want to withdrow from saving account");
                    b = sc.nextFloat();
                    c = a - b;
                    System.out.println("Now your saving account balances " + c);
                } else if (u == 4) {
                    System.out.println("Thank you to using atm");
                    break;
                } else {
                    System.out.println("Sorry you enter something wrong");
                }
                }
            else if(t==3){
                System.out.println("Thankyou to using atm");
                break;
            }
            else {
                System.out.println("You enter something wrong");
            }

            i++;

        }
    }
}
