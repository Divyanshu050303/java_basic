package com.company;
import java.util.Scanner;
class count{
    String s;
    count(String a){
        s=a;
    }
    public void vow(){
        int i, c=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i)=='u'
                    ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U')
                c+=1;
        }
        System.out.println(c+" vowel in the string");
    }

}
public class countVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        count c=new count(s);
        c.vow();
    }
}
