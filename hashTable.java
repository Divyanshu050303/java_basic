package com.company;
import java.util.*;
class hashTable1{
    public void to(){
        Hashtable<Integer, String> student=new Hashtable<Integer, String>();
        student.put(101, "Divyanshu");
        student.put(103, "Anurag");
        student.put(104, "Chinu");
        Set dataSet=student.entrySet();
        Iterator iterate=dataSet.iterator();
        while(iterate.hasNext()){
            Map.Entry map=(Map.Entry)iterate.next();
            System.out.println(map.getKey()+" "+ map.getValue());
        }
    }
}
public class hashTable {
    public static void main(String[] args) {
        hashTable1 t=new hashTable1();
        t.to();
    }
}
