package timesss;
import java.util.*;
interface AdvancedArithmetic{
        int divisorSum(int n);
    }
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum=1;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0)sum+=i;
        }
        if(n!=1)return sum+n;
        else return sum;
    }
}
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AdvancedArithmetic myCalculator = new Calculator();
        System.out.println("The sum of all divisor is"+myCalculator.divisorSum(n));
    }
}
