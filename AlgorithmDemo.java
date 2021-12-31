package com.company;
import java.util.*;
class driver{
    public void ma() {
        LinkedList ln = new LinkedList();
        ln.add(-8);
        ln.add(20);
        ln.add(-20);
        ln.add(8);
        Comparator r=Collections.reverseOrder();
        Collections.sort(ln,r);
        Iterator l=ln.iterator();
        System.out.println("List sort in Reverse Order");
        while (l.hasNext()){
            System.out.print(l.next()+" ");
        }
        System.out.println();
        Collections.shuffle(ln);
        l=ln.iterator();
        System.out.println("Shuffled Listed: ");
        while (l.hasNext()){
            System.out.print(l.next()+" ");
        }
        System.out.println();
        System.out.println("Minimum: "+Collections.min(ln));
        System.out.println("Maximum: "+Collections.max(ln));
    }
}
public class AlgorithmDemo {
    public static void main(String[] args) {
        driver d=new driver();
        d.ma();

    }
}
