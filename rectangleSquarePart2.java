package com.company;
class rectanglePart2{
    double length, breath;
    rectanglePart2(double l, double b){
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
class squarePart2 extends rectanglePart2 {
    squarePart2(int s){
        super(s, s);
    }
}
public class rectangleSquarePart2 {
    public static void main(String[] args) {
        rectanglePart2 r=new rectanglePart2(3,4 );
        r.area();
        r.parameter();
        System.out.println("Area and parameter of square with 10 input ");
        int []sq=new int[10];
        squarePart2[] a=new squarePart2[10];
        for(int i=0;i<10;i++){
            a[i]=new squarePart2(i);
        }
        for(int i=0;i<10;i++){
            a[i].area();
            a[i].parameter();
        }
    }
}
