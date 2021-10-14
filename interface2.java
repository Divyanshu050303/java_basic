package com.company;
class member{
    int age, salary;
    String name, address, number;

    public void printSalary() {
        System.out.println(salary);
    }
}
class employee extends member{
    String specialization;
}
class manager extends member{
    String department ;
}
public class interface2 {
    public static void main(String[] args) {
        employee e=new employee();
        e.age=23;
        e.salary=3400;
        e.name="Divyanshu";
        e.address="Hari nagar colony";
       e.number="7451047019";
       e.printSalary();
       manager m=new manager();
       m.age=34;
       m.salary=56000;
       m.name="Aryan singh";
       m.address="Mathura";
       m.number="7894561230";
       m.printSalary();
    }
}
