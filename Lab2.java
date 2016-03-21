

/**
­­­This program calculates an average test grade from 3 test scores provided by the user @ the command line 
*/

/*-------------------------------------------------------------------------
// AUTHOR: Sunjay Pandey
// FILENAME: Lab2.java
// SPECIFICATION: calculate average test score from user input of 3 scores
// FOR: CSE 110- Lab #2
// TIME SPENT: 45
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab2
	{
		public static void main(String[] arg)
		{
			Scanner scan = new Scanner(System.in);	
			int test1, test2, test3;
			final int NUMBER_OF_TESTS = 3;
			float testAverage = 0;

			// Ask user to enter test 1-3 scores:

			System.out.print("Enter the score on the first test: ");
			test1 = scan.nextInt();

			System.out.print("Enter the score on the second test: ");
			test2 = scan.nextInt();

			System.out.print("Enter the score on the third test: ");
			test3 = scan.nextInt();

			testAverage = (test1 + test2 + test3) / (float)NUMBER_OF_TESTS;

			System.out.println("Your average test score is: " + testAverage);
		}
	}