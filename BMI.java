package com.perscholas;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BodyMassIndex(BMI)isameasureofhealthonweight.
		 * Itcanbecalculatedbytakingyourweightinkilogramsanddividingbythesquareofyourheightinmeters.T
		 * heinterpretationofBMIforpeople16yearsorolderisasfollows:*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter your height");
		double height = input.nextDouble();
		System.out.println("enter weight");
		double weight = input.nextDouble();
		double BMI = weight / (height * height);
		System.out.println("My BMI is " + BMI);
		
		
		if (BMI < 18.5) 
		{
			System.out.println("you are underweight");
		}
		else if (BMI >= 18.5 & BMI < 25.0)
		{
			System.out.println("you are normal");
		}
		else if (BMI >= 25.0 & BMI < 30.0)
			System.out.println("you are overweight");
		else if (BMI >= 30.0)
			System.out.println("you are obese");
		}

}
