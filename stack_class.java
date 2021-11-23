package com.company;

import java.util.Stack;

public class stack_class {
    public static void main(String[] args) {
        Stack s1=new Stack();
        Stack s2=new Stack();
        // push some number onto the stack
        for(int i=0;i<10;i++){
            s1.push(i);
        }
        for(int i=10;i<20;i++){
            s2.push(i);
        }
        //pop those number off the stack
        System.out.println(" Stack one");
        for(int i=0;i<10;i++){
            System.out.println(s1.pop());
        }
        System.out.println("Stack two");
        for(int i=0;i<10;i++){
            System.out.println(s2.pop());
        }
    }
}
