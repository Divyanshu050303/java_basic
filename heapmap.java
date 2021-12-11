package com.company;
import java.util.*;
public class heapmap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("jhon doe", 2323.23);
        hm.put("divyanshu", 1212.12);
        Set set=hm.entrySet();
        Iterator i=set.iterator();
        while(i.hasNext()){
            Map.Entry me=(Map.Entry)i.next();
            System.out.println(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance=((Double)hm.get("jhon doe")).doubleValue();
        hm.put("jhon doe", balance+1000);
        System.out.println("Jhone doe's new balance :"+hm.get("jhon doe"));
    }
}
