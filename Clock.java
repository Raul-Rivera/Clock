/*
Name: Raul Rivera Ortiz
Course: CSC 122 001
Project #6
Project description:
	I made a Clock program with Java. The program has a driver with I made 10 diferent clocks
	in diferent ways. The program has 3 constructors, one constructor can work with 3 variables,
	hours, minutes and seconds. The other constructor can work with 5 variables, hours, minutes, 
	seconds, ap (can be 'AM' or 'PM') and z (for location, can be 'GMT', 'EST', 'CST', 'RST' and 'PST'),
	the other is a default constructor with the same name than the class. Also this program has a method
	called 'tick' with which the time can increase one second to check that the clock is working well.
	
Purpose:
	1. Understend how a clock program works.
	2. Become familiar with the driver class.
	3. Improve my math and analysis skills.
	
What the program does?:
	Fist, the program create a private values for hours, minutes, seconds, ap and z. Then use methods ( setHours,
	setMinutes and setSeconds)for difine parameters for the variables hours, minutes and seconds with the intention
	of get real values like a real clock.
	Then, the program create 2 constructors (there is one default constructor already, but I modificate a little) with 
	3 and 5 variables with the intention of create ther funtionality like a real clock adding parameters of location.
	Then, the program create get... methods to call the variables.
	Finally, the program create a method called tick, to increase in 1 second to the Clock.
	
	In another file called driverClock:
	
		First, I import java.io.* and java.util.*
		Then, I create a driver program to create a diferent simulations of Clock with the intetention of prove if
		the program Clock is usefull.
		I create a 10 diferents Clocks in diferent situations. Also I add the method tick to alterate some of them.
	
How you tested the program:
	First, I wrote my code on a Notepad.
	Then, I save the file in a folder that I made and call it Java-projects.
	Then, I opened the Command Prompt and moved it to the same Path with the command: cd
	Then I compiled the file with the command: javac Clock.java
	a new file was created with the same name but with the class extension.
	Then I compiled the other file with the command: javac driverClock.java
	a new file was created with the same name but with the class extension.
	Then I ran the driver program with the command: java driverClock.
	NOTE: 
		I use the package java.util to import the Scanner class and make inputs.
		I create a main method in the driver program to call the clock class and the methods.
		I create and if, else if and else conditions for eliminate the limitacions.
		I create a tick method to show how the clock change from 12:59:59 to 1:00:00
		
Limitations if any in the program:
	No limitations.
	Next implementation could be a visual clock (Clock in the screen like a real clock)
*/

public class Clock { //Open class Clock.
    private int hours; //hours
    private int minutes; //minutes
    private int seconds; //seconds
	private String ap; //hold a for AM or p for PM
	private String z; //times zones
	
	public Clock() { //Default constructor.
		this.hours = 12; //use of the 'this'
		this.minutes = 0; //use of the 'this'
		this.seconds = 0; //use of the 'this'
		this.ap = "AM"; //use of the 'this'
		this.z = "GMT";	//use of the 'this'
	} // close de default constructor.

    public void setHours(int newHours) { // Method to set hour parameters
		hours = newHours; // asigning value of newHour to hours
		if (hours<0 || hours > 12) { // If 0 < hours < 2
			hours = 0; // hours = 0
		} // end if statement.
    } // Close the method
	
    public void setMinutes(int newMinutes) { // Method to set minutes parameters
		minutes = newMinutes; // asigning value of newMinutes to minutes
		if (minutes<0 || minutes > 60) { // If 0 < minutes < 60
			minutes = 0; // minutes = 0
		} // end if statement.
    } // Close the method
	
    public void setSeconds(int newSeconds) { // Method to set seconds parameters
    seconds = newSeconds; // asigning value of newSeconds to seconds
		if(seconds<0 || seconds > 60) { // If 0 < seconds < 60
			seconds = 0; // seconds = 0
		} // end if statement.
    } // Close the method

	//Constructor for objects of class Clock with 3 variables
	
    public Clock(int newHour, int newMinute, int newSecond) { // Constructor with 3 variables
		if (newHour >= 0 && newHour <= 12) { // If 0 <= newHour <= 12
			this.hours = newHour; // asigning value of newHour to hours
		} else { //else
			setHours(hours); // Call the method setHours
		} // end else statement.
		if (newMinute >= 0 && newMinute < 60) { // If 0 <= newMinute <= 12
			this.minutes = newMinute; // asigning value of newMinutes to minutes
		} else { //else
			setMinutes(minutes); // Call the method setMinutes
		} //end else statement.
		if (newSecond >= 0 && newSecond < 60) { // If 0 <= newSecond <= 12
			this.seconds = newSecond; // asigning value of newSeconds to seconds
		} else { //else
			setSeconds(seconds); // Call the method setSeconds
		} //end else statement.
		
		ap = "AM"; //default
		z = "GMT"; //default
	} // Close the Clock method with 3 variables
	
	//Constructor for objects of class Clock with 5 variables
	
	public Clock(int newHour1, int newMinute1, int newSecond1, String newAp, String newLoc) { // Constructor with 5 variables
		if (newHour1 >= 0 && newHour1 <= 12) { //If 0 <= newHour1 <= 12
			this.hours = newHour1; // asigning value of newHour1 to hours
		} else { //else
			setHours(hours); // Call the method setHours
		} //end else statement.
		if (newMinute1 >= 0 && newMinute1 < 60) { // If 0 <= newMinute1 <= 12
			this.minutes = newMinute1; // asigning value of newMinutes1 to minutes
		} else { //else
			setMinutes(minutes); // Call the method setMinutes
		} //end else statement.
		if (newSecond1 >= 0 && newSecond1 < 60) { // If 0 <= newSecond1 <= 12
			this.seconds = newSecond1; // asigning value of newSeconds1 to seconds
		} else { //else
			setSeconds(seconds); // Call the method setSeconds
		} //end else statement.
		
		newAp = newAp.toUpperCase(); // return everything in uppercase
		if ((newAp.equals("AM")) || (newAp.equals("PM"))) // If newAp is equal to 'AM' or "PM" save the value.
			this.ap = newAp; // asigning value of newA to ap
		else //else
			ap = "AM"; // default
		
		newLoc = newLoc.toUpperCase(); // return everything in uppercase
		if ((newLoc.equals("GMT")) || (newLoc.equals("EST")) || (newLoc.equals("CST")) || (newLoc.equals("RST")) || (newLoc.equals("PST")) ) //if newLoc is equal to '...' save the value.
			this.z = newLoc; // asigning value of newLoc to z
		else //else
			z = "GMT";	// default
	} // Close the Clock method with 5 variables

	public int getHours() { // Method to call the hours.
		return hours;
	} // Close the method
	public int getMinutes() { // Method to call the minutes.
		return minutes;
	} // Close the method
	public int getSeconds() { // Method to call the seconds.
		return seconds;
	} // Close the method
	
	public String getAp() { // Method to call ap ('AM' or 'PM').
		return ap;
	} // Close the method
	
	public String getLoc() { // Method to call z ('GMS' or 'EST' or 'CST' or 'RST' or 'PST').
		return z;
	} // Close the method

	public String toString() {  //Method to call the String (hours:minutes:seconds ap | z)
		return hours + ":"+minutes+":"+seconds+" "+ap+" | "+z;
	} // Close the method

	public void tick() { // Method to add 1 second to the Clock.
		seconds = seconds +1; // seconds =+ 1
		if(seconds == 60) { // If seconds = 60
			minutes ++; // minutes + 1
			seconds = 0;
		} // end if statement.
		if(minutes == 60) { // If minutes = 60
			hours++; // hours + 1
			minutes = 0;
		} // end if statement.
		if(hours == 13) { // If hours = 13
			hours = 1; // hours = 1
		} // end if statement.
	} // Close the tick method
 } // Close the Class Clock.
 
/*

Microsoft Windows [Version 10.0.19041.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Owner>cd C:\Users\Owner\Java-projects

C:\Users\Owner\Java-projects>javac Clock.java

C:\Users\Owner\Java-projects>javac driverClock.java

C:\Users\Owner\Java-projects>java driverClock

T1: 0:0:0 AM | GMT
T2: 0:0:0 AM | GMT
T3: 3:23:30 PM | EST
T4: 3:23:32 PM | EST
T5: 7:30:0 PM | RST
T6: 7:0:0 PM | CST
T7: 1:0:0 AM | RST
T8: 0:0:1 AM | PST
T9: 6:3:9 AM | GMT
T10: 6:3:9 AM || GMT

C:\Users\Owner\Java-projects>dir
 Volume in drive C has no label.
 Volume Serial Number is 9242-0A43

 Directory of C:\Users\Owner\Java-projects

04/16/2021  09:36 PM    <DIR>          .
04/16/2021  09:36 PM    <DIR>          ..
04/19/2021  08:56 AM             2,511 Clock.class           (java compile)
04/19/2021  11:46 AM             8,032 Clock.java            (java file)
02/04/2021  01:02 AM             1,279 Diamond.class
02/04/2021  01:06 AM            11,880 Diamond.java
04/19/2021  08:56 AM             2,075 driverClock.class      (java driver compile)
04/19/2021  10:35 AM             2,734 driverClock.java       (java driver file)
04/09/2021  11:17 AM               101 examples.java
03/15/2021  12:38 AM             3,742 GameRecord.class
03/15/2021  12:44 AM            14,333 GameRecord.java
03/06/2021  12:45 AM             2,405 GameRopasc.class
02/16/2021  05:49 PM             1,984 GameRps.class
02/16/2021  01:45 AM             3,735 GameRps.java
01/20/2021  11:17 PM               417 Hello.class
08/16/2019  10:35 AM               119 Hello.java
01/22/2021  07:20 PM               573 HelloWorld.class
01/22/2021  07:18 PM             3,692 HelloWorld.java
04/13/2021  07:16 PM             1,648 myClock
04/16/2021  11:11 AM             1,654 myClock.java
03/10/2021  12:39 PM               686 MyName.class
03/10/2021  12:39 PM               483 MyName.java
04/09/2021  11:22 AM               509 new1.class
04/09/2021  11:22 AM               227 new1.java
04/12/2021  09:19 PM             1,019 PointExample1.class
04/12/2021  09:18 PM               294 PointExample1.java
02/15/2021  03:09 PM             1,032 RandomNum.class
02/15/2021  03:08 PM               779 RandomNum.java
03/15/2021  12:40 AM               418 Raul.txt
03/05/2021  02:32 PM             1,917 RecordTest.class
02/24/2021  11:55 AM             1,005 RecordTest.java
03/31/2021  09:38 PM             4,109 searchAndSort.class
03/31/2021  09:42 PM            29,263 searchAndSort.java
03/31/2021  09:39 PM             8,021 Sebas.txt
01/29/2021  11:59 PM               591 Stars.class
01/29/2021  11:59 PM               274 Stars.java
              34 File(s)        113,541 bytes
               2 Dir(s)  920,350,662,656 bytes free

C:\Users\Owner\Java-projects>

*/