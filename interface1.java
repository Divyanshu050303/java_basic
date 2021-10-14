package com.company;
class parents{
    private void parent(){
        System.out.println("This in parents class ");
    }
}
class children extends parents{
    public void child(){
        System.out.println("This is in child class");
    }
}
public class interface1 {
    public static void main(String[] args) {
        parents p=new parents();
        children c=new children();
        //p.parent();
        c.child();
       // c.parent();
    }
}
