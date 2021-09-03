// works of this program to print the current time and date
package com.company;
import java.util.Calendar;
class time{
    public void print(){
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
public class current_date_and_time {
    public static void main(String[] args) {
        time tm=new time();
        tm.print();
    }
}
