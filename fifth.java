package com.perscholas;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*The body mass index (BMI) is commonly used by health and nutrition professionals 
to estimate human body fat in populations.

It is computed by taking the individual's weight (mass) in kilograms 
and dividing it by the square of their height in meters.

An example of your output could be:
Your height in m: 
>1.75

Your weight in kg: 
>73

Your BMI is 23.83673*/
		Scanner input = new Scanner(System.in);
		System.out.println("Your Height? ");
		double x = input.nextDouble();
		System.out.println("your weight? ");
		double y = input.nextDouble();
		double a = y/(x * x);
		System.out.println("your BMI is " + a);
		
		
	}

}
