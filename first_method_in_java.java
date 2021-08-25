package com.company;
import java.util.Scanner;
public class first_method_in_java {
    static int percentage(int []marks, int x){
        int sum=0;
        for (int i=0; i<marks.length;i++) {
            sum+=marks[i];
        }
       return sum/x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, j, tim;
        System.out.println("Enter the number of subject ");
        n= sc.nextInt();
        int []marks=new int[n];
        for(j=0;j<n;j++){
            marks[j]=sc.nextInt();
        }
        tim=percentage(marks, n);
        System.out.println(tim);
    }
}
