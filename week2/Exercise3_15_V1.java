/**
­­­This program practices if/else logic
*/
/* Write a program that reads an integer and prints whether it is negative, zero, or positive.
/*-------------------------------------------------------------------------
// AUTHOR: King of Rock
// FILENAME: Exercise3_15_V1.java
// SPECIFICATION: if/else
// FOR: Chapter 3, Exercise 3.15
// TIME SPENT: 45
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Exercise3_15_V1
	{
		public static void main (String[] arg)
		{
			double x = 0;
			double y = 0;
			double z = 0;
			double largest = 0;

			Scanner scan = new Scanner(System.in);

			System.out.print("Please enter a numeric value for 'x':");
			x =  scan.nextDouble();

			System.out.print("Please enter a numeric value for 'y':");
			y =  scan.nextDouble();

			// check which of the first two entries is larger
			if (x >= y)
			{
				largest = x;
			}// end if

			else
			{
				largest = y;
			}// end else


			// Get the third entry
			System.out.print("Please enter a numeric value for 'z':");
			z =  scan.nextDouble();
			
			// Check if the third entry is larger than the largest of the first two
			if (z >= largest)
				{
						// if z is larger than any of the first two, make it the largest
						largest = z;
					
						System.out.printf("the largest is: %4.2f, you entered:" +
						" x = %4.2f, y = %4.2f, and z = %4.2f  \n", largest, x, y, z);
				} // end if
			else
				{

						System.out.printf("the largest is: %4.2f, you entered:" +
						" x = %4.2f, y = %4.2f, and z = %4.2f  \n", largest, x, y, z);
				}// end else

		}//main

	}// class