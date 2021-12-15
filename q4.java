package timesss;

import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
}
public class q4{
    public static void main(String[] args) {
        Student obj = new Student();
        if(obj.name.length()==0)
            System.out.println("Unknown");
        else
            System.out.println(obj.name);
    }
}
