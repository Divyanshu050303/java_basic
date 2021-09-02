package com.company;
import java.util.Scanner;
class strin{
    String str1, str2;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        str1=sc.nextLine();
        System.out.println("Enter the second string");
        str2=sc.nextLine();
    }
    public void print(){
        int c= str1.compareTo(str2);
        if (c==0){
            System.out.println("Both string are equal");
        }
        else if (c>0){
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
        else if (c<0){
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        }

    }
}
public class lexicographically {
    public static void main(String[] args) {
        strin st=new strin();
        st.input();
        st.print();
    }
}
