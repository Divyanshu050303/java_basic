package dateAndTime;


import java.util.*;

public class GregorianCalendarDemo {
    public static void main(String[] args) {


        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };
        int year;
        //Create a calendar initialized with the current date and time in the default locale and timezone
        GregorianCalendar cla = new GregorianCalendar();
        //Display current time and date information
        System.out.print("Date: ");
        System.out.print(months[cla.get(Calendar.MONTH)]);
        System.out.print(" " + cla.get(Calendar.DATE) + " ");
        System.out.println(year=cla.get(Calendar.YEAR));

        System.out.print("Time :");
        System.out.print(cla.get(Calendar.HOUR) + ":");
        System.out.print(cla.get(Calendar.MINUTE) + ":");
        System.out.println(cla.get(Calendar.SECOND));
         if(cla.isLeapYear(year))
         {
             System.out.println("The current year is a leap year");
         }
         else
         {
             System.out.println("The current is not a leap year");
         }
    }
}