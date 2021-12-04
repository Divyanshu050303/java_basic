package com.company;

import java.util.HashSet;

class hashset{
    public void print(){
        HashSet h=new HashSet();
        h.add("a");
        h.add("b");
        h.add("c");
        h.add("d");
        h.add("f");
        System.out.println("Element contain by the hash set is "+h);

    }
}
public class hashsetDemo {
    public static void main(String[] args) {
        hashset k=new hashset();
        k.print();
    }
}
