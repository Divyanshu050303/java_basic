package com.company;
import java.util.Scanner;
class binary{
    public void bin(int a){
        System.out.println("The unsigned integer in base 2 of "+a+ " is : "+Integer.toBinaryString(a));
    }
    public void oct(int a){
        System.out.println("The unsigned integer in base 8 of "+a+ " is : "+Integer.toOctalString(a));
    }
    public void hex(int a){
        System.out.println("The unsigned integer in base 16 of "+a+ " is : "+Integer.toHexString(a));
    }
}
public class ConversionMethods{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to change in binary");
        int n=sc.nextInt();
        binary b=new binary();
        b.bin(n);
        b.oct(n);
        b.hex(n);
    }
}
