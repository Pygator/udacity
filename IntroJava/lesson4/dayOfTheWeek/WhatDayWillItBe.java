// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        //Day birthday = new Day(1989, 7, 1);
        Day birthday = new Day(1900, 1, 1);
        Day startDay = new Day(1900, 1, 1);
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
         Day birthday = new Day(1989, 7, 1);
         Day startDay = new Day(1900, 1, 1);

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        //System.out.println("tempchu: " + birthday.getYear);
                           
        int totalDays = birthday.daysFrom(startDay);
        //System.out.println("Total Days: " + totalDays);
       
        int weekday = (totalDays+1) % 7;
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
