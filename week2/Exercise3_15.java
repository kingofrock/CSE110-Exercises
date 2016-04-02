/**
­­­This program practices if/else logic
*/
/* Write a program that reads an integer and prints whether it is negative, zero, or positive.
/*-------------------------------------------------------------------------
// AUTHOR: King of Rock
// FILENAME: Exercise3_15.java
// SPECIFICATION: if/else
// FOR: Chapter 3, Exercise 3.15
// TIME SPENT: 45
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Exercise3_15
	{
		public static void main (String[] arg)
		{
			double x = 0;
			double y = 0;
			double z = 0;

			Scanner scan = new Scanner(System.in);

			System.out.print("Please enter a numeric value for 'x':");
			x =  scan.nextDouble();

			System.out.print("Please enter a numeric value for 'y':");
			y =  scan.nextDouble();

			System.out.print("Please enter a numeric value for 'z':");
			z =  scan.nextDouble();
			
			if (x > y)
				{
					// is x > z?
					if (x > z)
					
						System.out.printf("x is the largest its: %4.2f, y and z are:" +
						" %4.2f and %4.2f \n", x, y, z);
					else 
					// z is larger

						System.out.printf("z is the largest its: %4.2f, x and y are:" +
						" %4.2f and %4.2f \n", z, x, y);
				}

			else if (y > x)
				{ 
					// is y > Z?
					if (y > z)

						System.out.printf("y is the largest its: %4.2f, x and z are:" +
						" %4.2f and %4.2f \n", y, x, z);
					
					else 
					// z is larger

						System.out.printf("z is the largest its: %4.2f, x and y are:" +
						" %4.2f and %4.2f \n", z, x, y);	
				}

			else if (z > x)

					// is z > y
					if (z > y)

						System.out.printf("z is the largest its: %4.2f, x and y are:" +
						" %4.2f and %4.2f \n", z, x, y);
					
					else 
					// y is larger

						System.out.printf("y is the largest its: %4.2f, x and y are:" +
						" %4.2f and %4.2f \n", y, x, z);	
			else 
				{
					System.out.printf("All values are equal: %4.2f, %4.2f and %4.2f \n", x, y, z);
				}

		}//main
	}// class
