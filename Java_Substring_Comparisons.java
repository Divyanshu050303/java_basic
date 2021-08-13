package com.company;
import java.util.Scanner;
public class Java_Substring_Comparisons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s, rev="", str="";
        s= sc.next();
        int n, i, m;
        n= sc.nextInt();
        m=s.length()-n;
        for(i=s.length()-1;i>=m;i--){
            rev+=s.charAt(i);
        }
        for (i=0; i<n;i++){
            str+=s.charAt(i);
        }
        System.out.println(rev);
        System.out.println(str);
    }
}
