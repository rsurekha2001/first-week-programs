package com.perscholas;

import java.util.Scanner;

public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first name");
		String x = input.next();
		System.out.println("enter the second name");
		String y = input.next();
		String a = x.concat(y);
		System.out.println(a);
	}

}
