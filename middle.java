package com.company;
import java.util.Scanner;
class midd{
    String str;
    midd(String a){
        str=a;
    }
    public String print(){
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
public class middle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s= sc.nextLine();
        midd a=new midd(s);
        System.out.println("The middle character is "+a.print());
    }
}
