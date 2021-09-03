package com.company;
import java.util.Scanner;
class cont{
    String str1, str2;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        str1=sc.nextLine();
        System.out.println("Enter the second string");
        str2=sc.nextLine();
    }
    public void print(){
        System.out.println("The concatenate of both the string is "+str1+" "+str2);
    }
}
public class concatenate {
    public static void main(String[] args) {
        cont st=new cont();
        st.input();
        st.print();
    }
}
