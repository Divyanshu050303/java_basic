package com.company;
import java.util.Scanner;
class longest{
    int i;
    String str;
    public void input(){
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        str=sc.nextLine();
    }
    public void print(){
        int l, h;
        int stat=0, end=1;
        for(i=1;i<str.length();i++){
            l=i-1;
            h=i;
            while (l>=0 && h<str.length() && str.charAt(l)==str.charAt(h)){
                if ((h-l+1)>end){
                    stat=l;
                    end=h-l+1;
                }
                l--;
                h++;
            }
            l=i-1;
            h=i+1;
            while (l>=0 && h<str.length() && str.charAt(l)==str.charAt(h)){
                if ((h-l+1)>end){
                    stat=l;
                    end=h-l+1;
                }
                l--;
                h++;
            }
        }
        int n=stat+end-1;
        for(i=stat;i<=n;i++){
            System.out.print(str.charAt(i));
        }
    }
}
public class longest_substring_palindromic {
    public static void main(String[] args) {
        longest ln=new longest();
        ln.input();
        ln.print();
    }
}
