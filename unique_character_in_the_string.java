package com.company;
import java.util.Scanner;
class unique {
    String str, str2 = "";
    int i;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
    }

    public void print() {
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str2.indexOf(ch) < 0) {
                str2 += ch;
            }
        }
        System.out.println("THe unique string is "+str2);
    }
}
public class unique_character_in_the_string {
    public static void main(String[] args) {
        unique uq = new unique();
        uq.input();
        uq.print();

    }
}