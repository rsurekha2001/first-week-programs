package com.perscholas;

import java.util.Scanner;

public class Sandbox {;
	public static void main(String[] args) {
		/*Create a String named [name]
Create an integer named [age]
Create a double named [wage]

Your code should ask the following question
Hello. What's your name?

Set [name] to the user's input

Your code should ask the following question
Hi [name]! How old are you?

Set [age] to the user's input

Your code should ask the following question
So you're [age], eh? That's not old at all!
How much do you make, [name]?

Set [wage] to the user's input

Finally, output this line
[wage]! That's really good for your [age]!
*/
	//char myName;
	//	int myAge;
	//	double myWage;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello. What's your name? ");
		String myName = input.nextLine();
		System.out.println("Hi " + myName +"! How old are you?");
		int myAge = input.nextInt();
		System.out.println("So you're " +  myAge + ", eh? That's not old at all!\r\n" + "How much do you make, " + myName +"?");
		double myWage = input.nextDouble();
		System.out.println(myWage + "! That's really good for your " + myAge);
		input.close();
		
	/*Scanner input = new Scanner(System.in);
	double myFarenheit = input.nextDouble();
	double celcius = (myFarenheit - 32.0) * 5.0/9.0;
	System.out.println(celcius);*/
	
	
	/*	int myTime = input.nextInt();
		int x = myTime/60;
		
		int y = myTime%60;
		
		System.out.println(x + " minutes");
		System.out.println(y + " seconds");*/
		
		
		
/*		int myInt = 3;
		System.out.println(myInt);
		myInt++;
		System.out.println(myInt);
		myInt--;
		System.out.println(myInt);*/
		
		
//	Scanner input = new Scanner(System.in);
	/*	System.out.println("Welcome to Java!");
		System.out.println("Enter a Double value: ");
		
		double d = input.nextDouble();
		System.out.println("Double value is: " + d); 
				
		int x = input.nextInt(); 
		if (x==2) {
			System.out.println("Number is equal to 2");
			input.close();
		}

		double ex = input.nextDouble();
		System.out.println(ex);*/
		//byte a = 130;
		
	/*int x = input.nextInt();
		if (x instanceof Int) {
			System.out.println("of type int");
		}
		else if (x instanceof Double) {
			System.out.println("of type double");
		}*/
	
	
	
						
	}

}
