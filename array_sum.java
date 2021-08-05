package com.company;
import java.util.Scanner;
public class array_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arrayX=new int [100][100];
        int  [][]arrayY=new int [100][100];
        int [][]arrayZ=new int[100][100];
        int n, c, i, j,m, c1, i1, j1, i2, j2;
        System.out.println("Enter the number  first array row");
        n= sc.nextInt();
        System.out.println("Enter the number first array column");
        c= sc.nextInt();
        for (i=1;i<=n;i++){
            System.out.println("Enter the "+i+" row");
            for(j=1;j<=c;j++){
                arrayX[i][j]=sc.nextInt();
            }
        }
        System.out.println("Here is your first array");
        for (i=1;i<=n;i++){
            for (j=1;j<=c;j++){
                System.out.print(arrayX[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println("Enter the number second array  row");
        m= sc.nextInt();
        System.out.println("Enter the number second array column");
        c1= sc.nextInt();
        for (i1=1;i1<=m;i1++){
            System.out.println("Enter the "+i1+" row");
            for(j1=1;j1<=c1;j1++){
                arrayY[i1][j1]=sc.nextInt();
            }
        }
        System.out.println("Here is your second array");
        for (i1=1;i1<=m;i1++){
            for (j1=1;j1<=c1;j1++){
                System.out.print(arrayY[i1][j1]);
                System.out.print(' ');
            }
            System.out.println();
        }
        for (i2=1;i2<=n;i2++){
            for (j2=1;j2<=c1;j2++){
                arrayZ[i2][j2]=arrayX[i2][j2]+arrayY[i2][j2];
            }
        }
        System.out.println("Here is your add of first and second array");
        for (i2=1;i2<=n;i2++){
            for (j2=1;j2<=c1;j2++){
                System.out.print(arrayZ[i2][j2]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
