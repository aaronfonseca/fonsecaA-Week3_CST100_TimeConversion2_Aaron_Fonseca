/** Program: Time Conversion Part 2
* File: TimeConversion_2.java
* Summary: Write a program that will prompt the user to enter a time in a decimal format 
* and print the amount of hours and minutes from the value entered.  
* Example, user enters 4.5 and application parses to 4 hours and 30 minutes.
* Author: Aaron Fonseca
* Date: July 9, 2016
**/

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class Convert {	
	
	public void start(double finalTime) 
	{
		// Find hours
		int hours = (int) finalTime;
		// Find Minutes
		int minutes = (int) (finalTime * 60) % 60;
		// Create times as string from hour + minutes
		String time = hours+":"+minutes;
	try 
    {   
		SimpleDateFormat _24Hour = new SimpleDateFormat("HH:mm");
	    SimpleDateFormat _12Hour = new SimpleDateFormat("hh:mm a");
	    Date _24HourTime = _24Hour.parse(time);
	    System.out.println(_12Hour.format(_24HourTime));
    } 
    catch (Exception e) 
	       {
	           e.printStackTrace();
	       }
    
	}
}

public class TimeConversion_2 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Get input from scanner
		System.out.print("Enter a time in a decimal format, Example 10.5 for 10:30: ");
		
		double decimalTime = input.nextDouble();
		input.close();
		
		Convert Time = new Convert();
		Time.start(decimalTime);
	   }
}

