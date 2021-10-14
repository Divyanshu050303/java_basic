package com.company;
class rectangle{
    double length, breath;
    rectangle(double l, double b){
        length=l;
        breath=b;
    }

    public void area(){
        System.out.println("The area of rectangle is "+(length*breath));
    }
    public void parameter(){
        System.out.println("The parameter of rectangle is "+(2*(length+breath)));

    }
}
class square extends rectangle {
    square(int s){
        super(s, s);
    }
}
public class rectangleSquare {
    public static void main(String[] args) {
        rectangle r=new rectangle(3,4 );
        r.area();
        r.parameter();
        square s=new square(3);
        s.area();
        s.parameter();
    }
}
