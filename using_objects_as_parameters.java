package com.company;
class test{
    int a, b;
    test(int i, int j){
        a=i;
        b=j;
    }
    boolean equals(test o){
        if(o.a==a && o.b==b){
            return true;
        }
        else{
            return false;
        }
    }
}
public class using_objects_as_parameters {

    public static void main(String[] args) {
        test ob1=new test(100, 22);
        test ob2=new test(100, 22);
        test ob3=new test(-1, -1);
        System.out.println("Ob1==OB2 "+ob1.equals(ob2));
        System.out.println("Ob1==OB2 "+ob1.equals(ob3));
    }
}
