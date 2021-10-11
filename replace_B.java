package com.company;

public class replace_B {
    public static void main(String[] args) {
        String s="abcdeasnb";
        int i=s.indexOf('b');
        System.out.println("The actual string is "+ s);
        System.out.println("After the replacement the b "+s.substring(0, i)+"z"+s.substring(i+1));
    }
}
