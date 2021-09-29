package com.company;
import java.util.Scanner;
class Test{
    int a;
    Test(int i){
        a=i;
    }
    Test incrByTen(){
        Test temp=new Test(a+10);
        return temp;
    }
}
public class returning_objects {
    public static void main(String[] args) {
        Test ts=new Test(2);
        Test ts2;
         ts2=ts.incrByTen();
        System.out.println("ts.a: "+ts.a);
        System.out.println("ts2.a: "+ts2.a);
        ts2=ts2.incrByTen();
        System.out.println("ts2.a after the second increase : "+ts2.a);
    }
}
