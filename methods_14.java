package com.company;
import java.math.BigInteger;
import java.util.Scanner;
class number{
    private int a;
    number(int i){
        a=i;
    }
    public boolean isZero(){
        boolean c=false;
        if (a==0)
            c=true;
        return c;
    }
    public boolean isPositive(){
        boolean c=false;
        if (a>0)
            c=true;
        return c;
    }
    public boolean isNegative(){
        boolean c=false;
        if (a<0)
            c=true;
        return c;
    }
    public boolean isOdd(){
        boolean c=false;
        if (a%2!=0)
            c=true;
        return c;
    }
    public boolean isEven(){
        boolean c=false;
        if (a%2==0)
            c=true;
        return c;
    }
    public boolean isPrime(){
        boolean c=false;
        for(int i=2;i<=a;i++){
            if(a%i==0){
                c=true;
            }
        }
        return c;
    }
    public boolean isArmstrong(){
        boolean c=false;
        int temp, digits=0, last=0, sum=0;
        temp=a;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = a;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if (a==sum)
            c=true;
        return c;
    }
    public long  getFactorial(){
        long mul=1;
        for(int i=1;i<=a;i++) {
            mul *= i;}
        return mul;
    }
    public double getSqart(){
        return  Math.sqrt(a);
    }
    public int getSquare(){
        return  a*a;
    }
    public int getDigitSum(){
        int sum=0;
        while (a!=0){
            sum=sum+(a%10);
            a=a/10;}
        return  sum;
    }
    public String displayBinary(){
        String bin=Integer.toBinaryString(a);
        return bin;
    }
    public String displayOctal(){
        String oct=Integer.toOctalString(a);
        return oct;
    }
    public String displayHexa(){
        String hex=Integer.toHexString(a);
        return hex;
    }
}
public class methods_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        number nu=new number(num);
        System.out.println("Number is zero "+nu.isZero());
        System.out.println("Number is Negative "+nu.isNegative());
        System.out.println("Number is odd "+nu.isOdd());
        System.out.println("Number is Even "+nu.isEven());
        System.out.println("Number is Prime "+nu.isPrime());
        System.out.println("Number is Armstrong "+nu.isArmstrong());
        System.out.println("Factorial of the number is  "+nu.getFactorial());
        System.out.println("Square root  of the number is  "+nu.getSqart());
        System.out.println("Square of the number is  "+nu.getSquare());
        System.out.println("Sum of digit of number is  "+nu.getDigitSum());
        System.out.println("Binary  of the  number is  "+nu.displayBinary());
        System.out.println("octal of number is  "+nu.displayOctal());
        System.out.println("Hexa of number is  "+nu.displayHexa());
    }
}
