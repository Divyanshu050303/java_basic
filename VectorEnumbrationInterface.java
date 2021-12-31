package com.company;

import java.util.*;

class VectorOperations{
//  initial size is 3, increment is 2
    public void pa(){
        Vector v=new Vector(3,2);
        System.out.println("Initial size "+v.size());
        System.out.println("Initial capacity: "+v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(4);
        System.out.println("Capacity after three additions "+v.capacity());
        v.addElement(55.4);
        System.out.println("Current Capacity: "+v.capacity());
        v.addElement(6.08);
        v.addElement(7);
        System.out.println("Current Capacity: "+v.capacity());
        v.addElement(6.34);
        v.addElement(10);
        System.out.println("Current Capacity: "+v.capacity());
        System.out.println("First Element : "+(Integer)v.firstElement());
        System.out.println("Last Element : "+(Integer)v.lastElement());
        if(v.contains(3)){
            System.out.println("Vectors contain 3");
        }

        Enumeration vEnum=v.elements();

        System.out.println("Element in vector:");
        while (vEnum.hasMoreElements()){

            System.out.print(vEnum.nextElement()+" ");
        }
        System.out.println();

    }
}
public class VectorEnumbrationInterface {
    public static void main(String[] args) {
        VectorOperations vm=new VectorOperations();
        vm.pa();

    }
}
