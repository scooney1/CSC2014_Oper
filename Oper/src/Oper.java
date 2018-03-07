/**
 * Author:	Sam Cooney
 * Project:	Oper
 * Date:	Aug 30, 2017
 * I assert that the program I am submitting is the result of my own efforts. 
 */

public class Oper {
	// This class is used to test out print, println, arithmetic
	// operators, and integer variables for parts 1 through 4 of 
	// lab 2. 
	
	public static void main (String[] args) {	// Name of Method is main
		//
		//----------------------Part 1-----------------------
		//
		System.out.println("*****************************************************");
		System.out.println("*                    Sam Cooney                     *");
		System.out.println("*                     CSC 2014                      *");
		System.out.println("*                    Project #2                     *");
		System.out.println("*****************************************************\n\n");
		
		//
		//----------------------Part 2-----------------------
		//
		System.out.print("CSC ");		// Demonstrates print
		System.out.print("2014\n");		// Demonstrates print
		System.out.println("CSC");		// Demonstrates println
		System.out.println("2014");		// Demonstrates println
		
		System.out.println("Hello, " + "World.\n");					// Demonstrates concatenation of  
		System.out.println("My favorite number is " + 7 + "\n");	// strings and integers.
		System.out.println("Today is August " + (20 + 10) + "\n");
		System.out.println("He told me, \"Never tell a lie.\"\n");
		System.out.println("Roses are \"Red\"\n\tViolets are \"Blue\"" +
		"\nSugar is sweet\n\t\tAnd so are \'you\'\n");
		
		//
		//----------------------Part 3-----------------------
		//
		int pears = 7; int pearPrice = 75; int peas = 3; int peasPrice = 80;	// Declaring integer
		int totalPears; int totalPeas; int grandTotal;							// variables. 
		
		totalPears = pears * pearPrice;			// Calculations using variables.
		System.out.println("Total Pears: " + totalPears + " cents.");
		totalPeas = peas * peasPrice;			// Calculations using variables.
		System.out.println("Total Peas: " + totalPeas + " cents.");
		grandTotal = totalPears + totalPeas;	// Calculations using variables.
		System.out.println("Grand Total: " + grandTotal + " cents.\n\n");
		
		double pearDec = 7; double pearPriceDec = 0.75; double totalPearDec;	// Declaring variables
		double peasDec = 3; double peasPriceDec = 0.80; double totalPeasDec;	// of type double.
		double grandTotalDec;													// cont.
		
		totalPearDec = pearDec * pearPriceDec;		// Calculations using variables.
		System.out.println("Total Pears: " + totalPearDec + " dollars.");
		totalPeasDec = peasDec * peasPriceDec;		// Calculations using variables.
		System.out.println("Total Peas: " + totalPeasDec + " dollars.");
		grandTotalDec = totalPearDec + totalPeasDec;// Calculations using variables.
		System.out.println("Grand Total: " + grandTotalDec + " dollars.\n\n");
		
		//
		//----------------------Part 4-----------------------
		//
		int remainder = 0; int quotient = 0;		// Declaring integer variables.
		int ten = 10; int three = 3; int five = 5;	// Declaring integer variables.
		int intAverage = 0;
		
		remainder = ten % three;					// Math using the % operator.
		System.out.println("The remainder of ten divided by three is: " + remainder + ".");
		remainder = ten % five;						// Math using the % operator.
		System.out.println("The remainder of ten divided by five is: " + remainder + ".");
		remainder = five % three;					// Math using the % operator/.
		System.out.println("The remainder of five divided by three is: " + remainder + ".");
		remainder = three % ten; 					// Math using the % operator.
		System.out.println("The remainder of three divided by ten is: " + remainder + ".");
		quotient = ten / three;						// Math using the / operator.
		System.out.println("The truncated quotient of ten divided by three is: " + quotient + ".");
		quotient = ten / five;						// Math using the / operator.
		System.out.println("The truncated quotient of ten divided by five is: " + quotient + ".");
		quotient = five / three;					// Math using the / operator/.
		System.out.println("The truncated quotient of five divided by three is: " + quotient + ".");
		intAverage = (ten + (2 * three) + five) / 4;// Integer average calculation.
		System.out.println("Integer average of ten, two threes, and five is: " + intAverage + ".\n\n");
		
		double remainderDec = 0; double quotientDec = 0;					// Declaring double variables.
		double tenDec = 10.0; double threeDec = 3.0; double fiveDec = 5.0;	// Declaring double variables.
		double averageDec;													// Declaring double variables.
		
		remainderDec = tenDec % threeDec;			// Math using the % operator.
		System.out.println("The remainder of ten divided by three is: " + remainderDec + ".");
		remainderDec = tenDec % fiveDec;			// Math using the % operator.
		System.out.println("The remainder of ten divided by five is: " + remainderDec + ".");
		remainderDec = fiveDec % threeDec;			// Math using the % operator/.
		System.out.println("The remainder of five divided by three is: " + remainderDec + ".");
		remainderDec = threeDec % tenDec; 				// Math using the % operator.
		System.out.println("The remainder of three divided by ten is: " + remainderDec + ".");
		quotientDec = tenDec / threeDec;			// Math using the / operator.
		System.out.println("The double quotient of ten divided by three is: " + quotientDec + ".");
		quotientDec = tenDec / fiveDec;				// Math using the / operator.
		System.out.println("The double quotient of ten divided by five is: " + quotientDec + ".");
		quotientDec = fiveDec / threeDec;			// Math using the / operator/.
		System.out.println("The double quotient of five divided by three is: " + quotientDec + ".");
		averageDec = (tenDec + (2 * threeDec) + fiveDec) / 4.0;// Double average calculation.
		System.out.println("Double average of ten, two threes, and five is: " + averageDec + ".\n\n");
		
	}	// End of method main
}		// End of class Oper
