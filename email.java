package com.company;
import java.util.*;
public class email {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s=new String();
        System.out.println("enter the email id");
        s=sc.next();
        if(s.indexOf(".in",s.indexOf("@"))==-1){
            System.out.println("id is not indian");
        }else{
            System.out.println("id is indian");

        }

        if(s.indexOf(".ac",s.indexOf("@"))==-1){
            System.out.println("id is not academic");
        }else{
            System.out.println("id is academic");

        }

    }
}