package com.company;

public class Throws {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside the demoproc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch (NullPointerException e){
            System.out.println("Recaught :"+e);
        }
    }
}
