package com.company;
import java.util.Scanner;
public class ascending_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i , j, n;
        System.out.println("Enter the number of element in the array...");
        n= sc.nextInt();
        int [] array=new int[n];
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(i=0; i<n;i++){

            for(j=i+1;j< array.length;j++){
                int temp=0;
                if (array[i]<array[j]){
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                }

            }
            System.out.print(array[i]+" ");
        }


        }

}
