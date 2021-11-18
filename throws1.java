package com.company;

public class throws1 {
static void throwOne() throws IllegalAccessException{
    System.out.println("Inside the throwOne ");
    throw new IllegalAccessException("Demo");
}

    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("Caught"+e);
        }
    }
}
