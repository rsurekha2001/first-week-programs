package com.perscholas;

import java.util.Scanner;

public class twonumrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int x;
	//	int y;
	//	System.out.println("what is " + x + "+" + y + "?");
		Scanner input = new Scanner(System.in);
		int rand = (int) (Math.random() * 10);
		int rand2 = (int) (Math.random() * 10);
		System.out.println(rand);
		System.out.println(rand2);
		System.out.println("what is " + rand + "+" + rand2 + "?");
		System.out.printf("what is the %d + %d ?", rand,rand2);
		int response = input.nextInt();
		if (response == rand + rand2)
		{
			System.out.println("you are correct");
		}
		else
		{
			System.out.println("try again ;(");
		}
		int score = input.nextInt();
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
input.close();
	}

}
