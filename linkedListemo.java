package com.company;

import java.util.LinkedList;

class linkedListDemo{
    public void print(){
        LinkedList l1=new LinkedList();
        l1.add("f");
        l1.add("h");
        l1.add("g");
        l1.add("d");
        l1.add("s");
        l1.add("a");
        l1.addFirst(1);
        l1.addLast(2);
        l1.add(1, "A");
        System.out.println("Original contents of l1 "+l1);
        l1.remove("f");
        l1.remove(2);
        System.out.println("Content pf l1 after deletion:"+l1);
        l1.removeFirst();
        l1.removeLast();
        Object  val=l1.get(2);
        l1.set(2, (String) val+" Changed");
        System.out.println("l1 after change"+l1);

    }
}
public class linkedListemo {
    public static void main(String[] args) {
        linkedListDemo l=new linkedListDemo();
        l.print();
    }
}
