package com.company;
import java.util.Arrays;
import java.util.Scanner;
class sort{
    String []s;
     sort(String[] c) {
        s=c;
     }

    public void print() {
        Arrays.sort(s);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
public class stringSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []c=new String[n];
        for(int i=0;i<n;i++){
            c[i]=sc.nextLine();
        }
        sort s=new sort(c);
        s.print();
    }
}
