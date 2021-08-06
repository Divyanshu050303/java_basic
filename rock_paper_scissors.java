package com.company;
import java.util.Scanner;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, name2, ro, pa;
        System.out.println("Ist player enter your name ");
        name1= sc.next();
        System.out.println("Enter your choice stone, paper and scissor ");
        ro= sc.next();
        System.out.println("Second player enter your name");
        name2= sc.next();
        System.out.println("Enter your choice stone, paper, scissor ");
        pa= sc.next();
        if ((ro.length()==4 && pa.length()==7) || (ro.length()==5 && pa.length()==4)||(ro.length()==7 && pa.length()==5)){
            System.out.println(name1+" Wins this match");
        }
        else if ((ro.length()==7 && pa.length()==4) || (ro.length()==4 && pa.length()==5)||(ro.length()==5 && pa.length()==7)){
            System.out.println(name2+" Wins this match");
        }
        else {
            System.out.println("sorry something wrong");
        }


    }
}
