package com.company;

public class expectional_handling {
    public static void main(String[] args) {
        // what is exception handling in java
        //The Exception Handling in Java is one of the powerful mechanism to
        // handle the runtime errors so that the normal flow of the application can be maintained
        // where we use the exception handling?
        //Exception handling ensures that the flow of the program doesn't break when an exception occurs.
        // In other word the exception is a run time error
        // java exception handling managed by five keyword 1. try, 2. catch , 3. throw ,4. throws 5. finally
        try {
            int a=45/0;
            System.out.println("This will not be printed ");
        }
        catch (ArithmeticException e){
            System.out.println("Divisible by 0");
        }
        finally
        {
            System.out.println("This will not be printed");
        }
        System.out.println("After the catch statement ");
    }
}
