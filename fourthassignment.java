package com.perscholas;

import java.util.Scanner;

public class fourthassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Make a simple numeric calculator. 
It should prompt the user for three numbers. 
Then add the numbers together and divide by 2. 
Display the result. 
Your program must support numbers with decimals and not just integers.

An example of your output could be:
What is your first number? 
>1.1

What is your second number? 
>2.2

What is your third number? 
>5.5

(1.1 + 2.2 + 5.5) / 2 is... 
4.4!
*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 numbers ");
	System.out.println("What is your first number? ");
	
		double x = input.nextDouble();
				System.out.println("What is your second number? ");
		double y = input.nextDouble();
		System.out.println("What is your third number? ");
		double z = input.nextDouble();
		
		double a = (x + y + z)/2;
		System.out.println("( " + x + " + " + y  + " +  " + z + " )/2 " + "is " + a);
				
				
		

	}

}
