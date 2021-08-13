package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Java_Loops_II {
    public static void main(String[] args) {
        int []arr=new int [100];
        int n, i, j, k;
        double c, sum1, sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i=0; i<n;i++)
        {
            for (j = 0; j <= 2; j++)
            {
                arr[j] = sc.nextInt();
            }
            sum1 = arr[0];
            for (k = 0; k < arr[2]; k++)
            {
                c = Math.pow(2, k);
                sum = sum1 + c * arr[1];
                System.out.print(String.format("%.0f", sum)+ " ");
                sum1 = sum;
            }
        }

    }
}
