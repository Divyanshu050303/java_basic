//How to reverse a String in java? Can you write a program without using any java inbuilt methods?
package com.company;
import java.util.Scanner;
class string{
    private String str;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
    }
    public void logic(){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
public class reverse_the_string_with_out_builtin_function {
    public static void main(String[] args) {
        string st=new string();
        st.input();
        st.logic();
    }
}
