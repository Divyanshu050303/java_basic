package com.company;

import java.util.*;


class iterDemo{
    public void print(){
        ArrayList a1=new ArrayList();
        a1.add("A");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        a1.add("D");
        System.out.println("Original content in a1");
        Iterator itr=a1.iterator();
        while (itr.hasNext()){
            Object e=itr.next();
            System.out.print(e+" ");
        }
        System.out.println();
        ListIterator litr=a1.listIterator();
        while(litr.hasNext()){
            Object e=litr.next();
            System.out.print(e+"+");
        }
        System.out.println();
        System.out.println("Modified content in a1:");
        itr=a1.iterator();
        while (itr.hasNext()){
            Object e=itr.next();
            System.out.print(e+"");
        }
        System.out.println();
        System.out.println("Modified list backward");
        while (litr.hasNext()){
            Object e=litr.next();
            System.out.println(e+" ");
        }
        System.out.println();
    }
}
public class IteratorDemo {
    public static void main(String[] args) {
        iterDemo i=new iterDemo();
        i.print();
    }
}
