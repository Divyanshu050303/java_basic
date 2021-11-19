package com.company;
class MyException extends Exception{
    private int details;
    MyException(int a){
        details=a;
    }
    public String toString(){
        return "My Exception ["+details+"]";
    }
}
public class creatingYourOwnExceptionSubclasses {
    static void compute(int a) throws MyException{
        System.out.println("Called compute("+a+")");
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }
        catch (MyException a){
            System.out.println("Caught "+a);
        }
    }
}
