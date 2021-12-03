package com.company;

import java.util.ArrayList;

class arrayaist{
    public void print(){
        ArrayList a1=new ArrayList();
        System.out.println("Initial size of a1:"+a1.size());
        a1.add("c");
        a1.add("a");
        a1.add("s");
        a1.add("d");
        a1.add("f");
        a1.add("g");
        a1.add("x");
        a1.add("z");
        a1.add(1, "A2");
        System.out.println("Size of a1 after additions:"+a1.size());
        System.out.println("Content of a1"+a1);
        a1.remove("a");
        a1.remove(2);
        System.out.println("Size of a1 after the deletions:"+a1.size());
        System.out.println("Content of a2"+a1);

    }
}
public class arrayListDemo {
    public static void main(String[] args) {
        arrayaist a=new arrayaist();
        a.print();
    }
}
