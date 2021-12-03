package com.company;

import java.util.ArrayList;

class arraylist_toarray{
    public void print(){
        ArrayList a=new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("Contents of a"+a);
        Object b[]=a.toArray();
        int sum=0;
        for(int i=0;i<b.length;i++){
            sum+=((Integer)b[i]).intValue();
            
        }
        System.out.println("Sum is :"+sum);
    }
}
public class arrayList_to_array {
    public static void main(String[] args) {
        arraylist_toarray m=new arraylist_toarray();
        m.print();
    }
}
