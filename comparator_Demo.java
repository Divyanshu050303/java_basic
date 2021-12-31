package com.company;


import java.util.*;
class MyCom implements Comparator{
    public int compare(Object a, Object b){
        String aStr, bStr;
        aStr = (String)a;
        bStr = (String)b;
        return bStr.compareTo(aStr);
    }
}
public class comparator_Demo {
    public static void main(String[] args) {
        TreeSet ts= new TreeSet(new MyCom());
        ts.add("1");
        ts.add("2");
        ts.add("3");
        ts.add("4");
        Iterator i =ts.iterator();
        while (i.hasNext()){
            Object element =i.next();
            System.out.println(element+" ");
        }
        System.out.println();
    }
}
