package com.company;

import java.util.TreeSet;

class treeSet{
    public void print(){
        TreeSet s=new TreeSet();
        s.add("B");
        s.add("D");
        s.add("A");
        s.add("C");
        System.out.println("Element contain by the tree set is: "+s);
    }
}
public class treesetdemo {
    public static void main(String[] args) {
        treeSet a=new treeSet();
        a.print();
    }
}
