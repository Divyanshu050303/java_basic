package com.company;
import java.util.Scanner;
class cou{
    String s;
    cou(String a){
        s=a;
    }
    public void count() {
        int count = 0;
        if (!(" ".equals(s.substring(0, 1))) || !(" ".equals(s.substring(s.length() - 1)))) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        System.out.println("Number of word in string is "+count);
    }
}
public class countTheWordInTheString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to count the word in it");
        String s=sc.nextLine();
        cou c=new cou(s);
        c.count();
    }
}
