package LAB10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
	public static void main(String arg[])
    {  
		try
		{
			// create object of scanner class.
			Scanner KB=new Scanner(System.in);
			
			// enter both the numbers for operation.
			System.out.print("Enter First Number : ");
			int x=KB.nextInt();

			System.out.print("Enter Second Number : ");
			int y=KB.nextInt();
			int z=x/y;
			
			// show the result.
			System.out.println("Result:"+z);
		}
		catch(InputMismatchException e)
		{
			// show if value is invalid.
			System.out.println("Invalid Input...");}
			catch(ArithmeticException e)
		{
			// show when number is divided by 0.
			System.out.println("Error:Divide By ZERO");
		}
    }
}
//output

//Enter First Number : 10
//Enter Second Number : 0
//Error:Divide By ZERO

//Enter First Number : 10.52
//Invalid Input...