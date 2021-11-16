package com.company;

public class multiple_catch_clauses {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = "+a);
            int b=42/a;
            int []c={1};
            c[43]=99;
        }
        catch (ArithmeticException e){
            System.out.println("Divided by 0 "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound"+e);
        }
    }
}
