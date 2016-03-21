
/**
­­­This program calculates the tip to be left at a restaurant based on the amount of the bill and the desired tip amount 
*/
/*-------------------------------------------------------------------------
// AUTHOR: Sunjay Pandey
// FILENAME: Assignment1.java
// SPECIFICATION: calculate tip amount to be left
// FOR: CSE 110- Assigment #1
// TIME SPENT: 60
//-----------------------------------------------------------*/

/* QUESTIONS FROM PART 1

(a) Change TempConverter to tempConverter.
-- The compiler is looking for a file named identically to the public class named in the source file.
-- Using a lower case 't' for the public class when the file is named with a capital 'T' is erroneous

(b) Remove the first quotation mark in the first string literal in the first System.out.println( ) statement.
-- The compiler is looking for a closure for the argument after the .println
-- It sees System.out.println(Celsius ...) without and introducing string, so it is interpreting the left parentheses
-- and the word Celsius as an argument that needs to be terminated with a right parenthetical

(c) Remove the semicolon at the end of the first println( ) statement.
-- The compiler is expecting a terminating semicolon and indicates this explicitly

(d) Remove the last brace in the program.
-- Braces are unbalanced; because their are two left braces, the
-- compiler is expecting two right braces. it reaches the end-of-file
-- before it finds the second one.

(e) Change the variable name fahrenheitTemp to fahrenheit in any one place in the code. 
-- the compiler complians that it cannot find the 'symbol' farenheit
-- this indicates that the variable name has not been previously defined
*/


/* QUESTIONS FROM PART 2

(1) mystery = 4; calculated as follows 
	integer (5) = 5 plus
	- (integer (5) / integer (2)) = 2 plus
	1
	
2) int a = 3, b = 10, c = 7, double w = 12.9, y = 3.2
a) 0 					| a/b = 3/10 = 0.3
b) 3.33 				| (double) b/a = 10/3 = 3.33
c) 2 					| a - b/c = 3 - (10/7) = 3 - (1.42)
d) 4.3					| w/(int) y = 12.9/3
e) 0.24					| y/w = 3.2/12.9
f) 1					| b % c / a = 10 % 7 / 3 = 3/3
g) 1					| b % a = 10/3

//------------------------------------------------------------------------------------------------------- */

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment1
	{
		public static void main(String[] arg)
		{
			// instantiate Scanner object
			Scanner scan = new Scanner(System.in); 

			// create number format object and use getcurrencyinstance method
			NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); 

			// establish local variables
			double grossBill = 0;
			int tipPct = 0;
			double tipAmt = 0.00;
			double totalBill = 0.00;
			final int PERCENT_CONVERTER = 100;
	

			// Ask user to enter bill and desired tip percentage
			System.out.print("Enter the bill amount without the '$': ");
			grossBill = scan.nextDouble();

			System.out.print("What percent would you like to tip: ");
			tipPct = scan.nextInt();

			// Calculate tip amt, final bill, and print both
			tipAmt = grossBill * tipPct/PERCENT_CONVERTER;
			totalBill = grossBill + tipAmt;
			System.out.println("Tip Amount: " + fmt1.format(tipAmt));
			System.out.println("Total amount with tip: " + fmt1.format(totalBill));

		}// end main
	}// end public
