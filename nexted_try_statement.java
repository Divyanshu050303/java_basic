package com.company;

public class nexted_try_statement {
    public static void main(String[] args) {
        try{
            int a=args.length;
            int b=42/a;
            System.out.println("a = "+a);
            try{
                if(a==1){
                    a=a/(a-a);
                }
                if(a==2){
                    int c[]={1};
                    c[23]=98;
                }
            } catch (ArithmeticException e){
                System.out.println("Divided by 0 "+e);
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound"+e);
        }
    }
}
