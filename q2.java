package timesss;
class Member {
    String name,Adress;
    int age,salary;
    long ph;
    Member(String name, int age, long ph, String Adress, int salary){
        this.name=name;
        this.age=age;
        this.ph=ph;
        this.Adress=Adress;
        this.salary=salary;
    }

    public void print_salary(){
        System.out.println(salary);
    }
}
class Employee extends Member{
    String Spcl;
    Employee(String name, int age, long ph, String Adress, int salary, String Spcl){
        super(name,age,ph,Adress,salary);
        this.Spcl=Spcl;
    }
    public void print_salary(){
        System.out.println(salary);
    }
}

class Manager extends Member{
    String Dep;
    Manager(String name, int age, long ph, String Adress, int salary, String Dep){
        super(name,age,ph,Adress,salary);
        this.Dep=Dep;
    }
    public void print_salary(){
        System.out.println(salary);
    }
}

public class q2{
    public static void main(String[] args) {
        Employee obj1 = new Employee("Abhishek Bansal", 20, 1234567890, "Mathura", 50000, "Software Eng");
        Manager obj2 = new Manager("Aman Bansal", 30, 1234567890, "Hathras", 70000, "Software");
        obj1.print_salary();
        obj2.print_salary();
    }
}

