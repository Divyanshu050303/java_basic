package com.company;
import java.util.Scanner;
class difference{
    private int []array1=new int[10];
    private int lag, small;
    public int getLag() {
        return lag;
    }
    public int getSmall() {
        return small;
    }
    public int getDifference(){
        return lag-small;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int i, n= sc.nextInt();
        for(i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
         lag=array1[0];
         small=array1[0];
        for (i=0; i<n;i++){
            if (lag<array1[i]){
                lag=array1[i];
            }
            else if(small>array1[i]){
                small=array1[i];
            }
        }
    }
}
public class differenceBetweenTheLargestAndSmallestValuesInArray {
    public static void main(String[] args) {
        difference di=new difference();
        di.input();
        System.out.println("Largest number in the array is "+ di.getLag());
        System.out.println("Smallest number in the  array is "+di.getSmall());
        System.out.println("The difference between the largest number and smallest number is "+di.getDifference());
    }
}