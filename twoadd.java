package com.perscholas;

import java.util.Scanner;

public class twoadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int s = x + y;
		int m = x * y;
		double avg = (double) s / 2;
		System.out.println("sum of two number " + s);
		System.out.println("mul of two number " + m);
		System.out.println("avg of two number " + avg);
	}

}
