package com.company;

public class finally1 {
    static void proA(){
        try{
            System.out.println("Inside the pro A");
            throw new RuntimeException("Demo");
        }finally {
            System.out.println("Inside the pro A's Finally");
        }
    }
    static void proB() {
        try {
            System.out.println("Inside the pro B");
            return;
        } finally {
            System.out.println("Inside the pro B's Finally");
        }
    }
    static void proC(){
        try{
            System.out.println("Inside the pro C");
        }
        finally {
            System.out.println("Inside the pro c's finally");
        }
    }

    public static void main(String[] args) {
        try{
            proA();
        }
        catch (Exception e){
            System.out.println("Exception caught");
        }
        proB();
        proC();
    }
}
