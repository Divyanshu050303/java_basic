package timesss;
class Arithmetic{
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}
class Adder extends Arithmetic {
    public int callAdd(int a, int b){
        return add(a,b);
    }
}
public class q6{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}