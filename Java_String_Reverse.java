package com.company;
import java.util.Scanner;
public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s, rev = "";
        int n, i, c =0;
        s = sc.nextLine();
        n = s.length();
        for (i = n - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        for (i = 0; i < n; i++) {
            if (rev.charAt(i) == s.charAt(i)) {
                c += 1;
            }
        }
            if (c == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


    }
}
