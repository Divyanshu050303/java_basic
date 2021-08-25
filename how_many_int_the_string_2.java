package com.company;
import java.util.Scanner;
public class how_many_int_the_string_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int i, c=0;

        for ( i=0; i<s.length();i++)
            if (s.charAt(i)!=' '){
                c+=1;
        }
        System.out.println("Length of the string is "+c);
    }
}
