package com.company;
import java.util.Scanner;
class evenOdd{
  private int []array1=new int[10];
  private int even=0, odd=0;
    public int getEven() {
        return even;
    }
    public int getOdd() {
        return odd;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int i, n ;
        n=sc.nextInt();
        for (i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        for (i=0;i<n;i++){
            if (array1[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
    }
}
public class even_and_odd_integer_in_separate_array {
    public static void main(String[] args) {
        evenOdd eo=new evenOdd();
        eo.input();
        System.out.println(eo.getEven()+" are even number in the array");
        System.out.println(eo.getOdd()+" are odd number in the array");
    }
}
