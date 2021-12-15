package timesss;
import java.util.Scanner;
class MyCalculator {
    public long power(int n, int p) throws Exception
    {
        if(n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else
            return (long)(Math.pow(n,p));
    }
}
public class q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MyCalculator cal=new MyCalculator();
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(cal.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
        }
    }
}

