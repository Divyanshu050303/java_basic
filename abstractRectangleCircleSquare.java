package com.company;
abstract class shapes2{
    abstract void rectangles1(double len, double breath);
    abstract  void square2(double side);
    abstract void circle1(double radius);
}
class area2 extends shapes2{
    void rectangles1(double l, double b){
        System.out.println("Area of rectangle is "+l*b);
    }
    void square2(double s){
        System.out.println("The area of square is "+s*s);
    }
    void circle1(double r){
        System.out.println("The area of circle is "+(2*3.14*r*r));
    }
}
public class abstractRectangleCircleSquare {
    public static void main(String[] args) {
        area2 a=new area2();
        a.rectangles1(3, 4);
        a.circle1(2);
        a.square2(4);
    }
}
