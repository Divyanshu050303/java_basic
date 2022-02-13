package com.company;
import java.util.Scanner;
public class WorldChessChampionship {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int numberOfInput=sc.nextInt();
     for (int i = 0; i < numberOfInput; i++) {
            int c=0, d=0, n=0;
            int x=sc.nextInt();
            String st=sc.next();
            for(int j=0;j<st.length();j++)
            {
                if(st.charAt(j)=='C')
                {
                    c+=2;
                }
                else if(st.charAt(j)=='N')
                {
                    n+=2;
                }
                else
                {
                    d+=1;
                }
            }
            if(c+d>n+d)
            {
                System.out.println(60*x);
            }
            else if(c+d==n+d)
            {
                System.out.println(55*x);
            }
            else
            {
                System.out.println(40*1);
            }

        }
    }
}
