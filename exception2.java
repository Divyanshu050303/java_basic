package oops_lab;

public class exception2 {
    public static void main(String[] args) {
        int sum=0;
        for(String a :args){
            try {
                sum+=Integer.parseInt(a);
            }
            catch (NumberFormatException e){
                System.out.println(a+" is not int");
            }

        }
        System.out.println("The sum is "+sum);
    }
}
