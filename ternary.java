package com.perscholas;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number");
		int x = input.nextInt();
		input.close();
		int y = x>0 ? 1: -1;
		
		String m = x>0 ? "yes":"no";
		
		System.out.printf("y = %d",y);
		System.out.println("m = " + m);
		

	}

}
