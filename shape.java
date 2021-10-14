package com.company;
class Shapes{
    public void printShape(){
        System.out.println("This is in shape class");
    }
}
class Rectangle extends Shapes{
    public void printRectangle(){
        System.out.println("This is in rectangle class or this is a rectangle shape");
    }
}
class circle extends Shapes{
    public void Circle(){
        System.out.println("This is an circle class or this is an circle shape");
    }
}
class Square extends Rectangle{
    public void printSquare(){
        System.out.println("Square is a rectangle");
    }
}
public class shape {
    Square s=new Square();
   // s.printRectangle();
}
