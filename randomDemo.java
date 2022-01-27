package random;

import java.util.Random;

public class randomDemo {
    // The Random class is a generator of pseudorandom numbers.These are called pseudorandom number because they are
    //simply uniformly distributed sequence
    public static void main(String[] args) {
        Random r=new Random();
        double val;
        double sum=0;
        int []bell=new int[10];
        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;
            for (int j = 0; j < 10; j++, t += 5) {
                if (val < t) {
                    bell[j] += 1;
                    break;
                }
            }
        }
            System.out.println("Average of values :"+(sum/100));
            for(int k=0;k<10;k++)
            {
                for (int j = bell[k]; j >0 ; j--)
                    System.out.print("*");
                System.out.println();
            }


    }
}
