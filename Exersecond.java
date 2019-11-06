package com.perscholas;

import java.util.Scanner;

public class Exersecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program that takes two numbers as input and display the product of two numbers.

Example:
Input first number: 25
Input second number: 5
Expected Output: 25 x 5 = 125*/
		int a;
		int b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("Product of two number: " + a +" and "+ b + " is " + (a*b));
		
		input.close();
		
		

	}

}
