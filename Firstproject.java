package com.perscholas;

import java.util.Scanner;

public class Firstproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	First, print the following line:
			Please enter the following information so I can sell it for a profit!

			Then, prompt the user for the following pieces of information:
			First Name as a String named [fname]
			Last Name as a String named [lname]
			Grade (9-12) as an int named [grade]
			Student ID as an int named [id]
			Login as a String named [login]
			GPA (0.0-4.0) as a double named [gpa]

			Finally, print the following lines:
			Your Information:
			Login: [login]
			ID: [id]
			Name: [lname], [fname]
			GPA: [gpa]
			Grade: [grade] */
		System.out.println("Please enter the following information so I can sell it for a profit!");
		Scanner input = new Scanner(System.in);
		System.out.println("What's your first name? ");
		String firstName = input.next();
		System.out.println("What's your Last name? ");
		String lastName = input.next();
		System.out.println("What's your grade(9-12)? ");
		int grade = input.nextInt();
		System.out.println("What's your student ID? ");
		int studentId = input.nextInt();
		System.out.println("What's your login? ");
		String login = input.next();
		System.out.println("What's your GPA? ");
		double GPA = input.nextDouble();
		System.out.println("Your Information:\r\n" + "Login: " + login +
				"\r\nID: " + studentId +
				"\r\nName: " + lastName + firstName +
				"\r\nGPA: " + GPA + 
				"\r\nGrade: " + grade);
		
		
		
		

	}

}
