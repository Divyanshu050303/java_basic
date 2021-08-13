package com.company;
import java.util.Scanner;
public class Java_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s, result="";
        int i, n,m;
        s=sc.next();
        n=sc.nextInt();
        m=sc.nextInt();
        for (i=n; i<m;i++){
            result+=s.charAt(i);
        }
        System.out.println(result);
    }
}
