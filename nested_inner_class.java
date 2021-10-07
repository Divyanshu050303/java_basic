package com.company;
class outer {
    int out=100;
    void test(){
        inner in=new inner();
        in.display();

    }
    class inner{
        void display(){
            System.out.println("Display : out value = "+out);

            inner2 i=new inner2();
            i.display2();
        }
    }
    class inner2{
        void display2(){
            System.out.println("This is the second  display function "+out);
        }
    }
}
public class nested_inner_class {
    public static void main(String[] args) {
        outer ot=new outer();
        ot.test();
    }
}
