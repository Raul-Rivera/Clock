import java.io.*; // for input keyboard
import java.util.*; //Import the Scanner class, for create a input.

public class driverClock { //Open class driverClock.
    public static void main(String [] args){ //Start main method.  
		
		Scanner console = new Scanner(System.in); //Initialize the Scanner.
		Clock c1 = new Clock(); //default
		
		//I Create some 10 clocks and print their times
		//Note: 'ap' represent 'AM' or 'PM'
		//Note: 'z' represent 'GMS' or 'EST' or 'CST' or 'RST' or 'PST'
		 
		// Clock with negatives values, not 'ap' and 'z', the clock will take the default values
		c1 = new Clock(-7,-23,-10);
		System.out.println("T1: "+ c1);

		// Clock with values out of the range, not 'ap' and 'z', the clock will take the default values
		c1 = new Clock(27,60,60, "VR", "RRR");
		System.out.println("T2: "+ c1);

		// Clock with good values, 'ap' and 'z' in lowercase, the clock will print 'ap' and 'z' in capital letters
		c1 = new Clock(3,23,30, "pm", "est");
		System.out.println("T3: "+ c1);

		//Use the method tick twice and print its time
		c1.tick(); //tick 1 second
		c1.tick(); //tinck 1 more second
		System.out.println("T4: "+ c1); // Clock print the same time than T3 + 2 seconds

		// Clock with good values, 'ap' and 'z' in lowercase and capital letters, the clock
		// will print the time + 1, also 'ap' and 'z' in capital letters.
		c1 = new Clock(7,29,59, "pM", "RsT");
		c1.tick();
		System.out.println("T5: "+ c1);
		
		// Clock with good values, 'ap' and 'z' in lowercase and capital letters, the clock
		// will print the time + 1, also 'ap' and 'z' in capital letters.
		c1 = new Clock(6,59,59, "Pm", "csT");
		c1.tick();
		System.out.println("T6: "+ c1);
		
		// Clock with good values, 'ap' is not a aceptable value 'z' in lowercase and capital letters, the clock
		// will print the time + 1, also 'ap' default and 'z' in capital letters.
		c1 = new Clock(12,59,59, "rrr", "rST");
		c1.tick();
		System.out.println("T7: "+ c1);
		
		// Clock with good values, 'ap' and 'z' in lowercase and capital letters, the clock
		// will print the time + 1, also 'ap' and 'z' in capital letters.
		c1 = new Clock(0,0,0, "aM", "pst");
		c1.tick();
		System.out.println("T8: "+ c1);
		
		// I asign the clock with provitionals values then I call the set methods to call de hours,
		// minutes and seconds, then print the Clock.
		c1 = new Clock(1,1,1);
		c1.setHours(6);
		c1.setMinutes(3);
		c1.setSeconds(9);
		System.out.println("T9: "+ c1);
		
		// This is another way to call another method and print the Clock
		System.out.println("T10: "+c1.getHours()+":"+c1.getMinutes()+":"+c1.getSeconds()+" "+c1.getAp()+" || "+c1.getLoc());
	}
}