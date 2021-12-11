package com.company;

import java.util.Iterator;
import java.util.LinkedList;

class Address{
    private String name, street, city, state, code;
    Address(String n, String s, String c, String st, String cd){
        name=n;
        street=s;
        city=c;
        state=st;
        code=cd;
    }
    public String toString(){

        return name+"\n"+street+"\n"+city+" "+state+" "+code;
    }
}
public class Storing_user_Defined_classes_in_collection {
    public static void main(String[] args) {
        LinkedList m=new LinkedList();
        m.add(new Address("J.W west", "l1 Oak Ave", "Urabana", "IL", "61853"));
        m.add(new Address("J.W east", "l1 sasni", "hathras", "LI", "99976"));
        Iterator itr=m.iterator();
        while (itr.hasNext()){
            Object element=itr.next();
            System.out.println(element+"\n");
        }
        System.out.println();
    }
}
