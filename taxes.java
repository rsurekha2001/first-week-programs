package com.perscholas;

import java.util.Scanner;

public class taxes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter you status : ");
		int status = input.nextInt();
		System.out.println("enter your Annual income : ");
		double AI = input.nextDouble();

		if (status == 0) {
			System.out.println("Compute tax for single filers");
			if (AI >= 0 && AI <= 8350) {
				System.out.println("the marginal tax rate 10%");
			} else if (AI >= 8351 && AI <= 33950) {
				System.out.println("the marginal tax rate 15%");
			} else if (AI >= 33951 && AI <= 82250) {
				System.out.println("the marginal tax rate 25%");
			}else if (AI >= 82251 && AI <= 171550) {
				System.out.println("the marginal tax rate 28%");
			}else if (AI >= 171551 && AI <= 373950) {
				System.out.println("the marginal tax rate 33%");
			}else if (AI >= 373951) {
				System.out.println("the marginal tax rate 35%");
			}
		}

		else if (status == 1) {
			System.out.println("Compute tax for married file jointly or qualifying widow(er)");
			if (AI >= 0 && AI <= 16700) {
				System.out.println("the marginal tax rate 10%");
			} else if (AI >= 16701 && AI <= 67900) {
				System.out.println("the marginal tax rate 15%");
			} else if (AI >= 67901 && AI <= 137050) {
				System.out.println("the marginal tax rate 25%");
			}else if (AI >= 137051 && AI <= 208850) {
				System.out.println("the marginal tax rate 28%");
			}else if (AI >= 208851 && AI <= 372950) {
				System.out.println("the marginal tax rate 33%");
			}else if (AI >= 372951) {
				System.out.println("the marginal tax rate 35%");
			}
		} else if (status == 2) {
			System.out.println("Compute tax for married file separately");
			if (AI >= 0 && AI <= 8350) {
				System.out.println("the marginal tax rate 10%");
			} else if (AI >= 8351 && AI <= 33950) {
				System.out.println("the marginal tax rate 15%");
			} else if (AI >= 33951 && AI <= 68525) {
				System.out.println("the marginal tax rate 25%");
			}else if (AI >= 68526 && AI <= 104425) {
				System.out.println("the marginal tax rate 28%");
			}else if (AI >= 104426 && AI <= 186475) {
				System.out.println("the marginal tax rate 33%");
			}else if (AI >= 186476) {
				System.out.println("the marginal tax rate 35%");
			}
		} else if (status == 3) {
			System.out.println("Compute tax for head of household");// Compute tax for head of household
			if (AI >= 0 && AI <= 11950) {
				System.out.println("the marginal tax rate 10%");
			} else if (AI >= 11951 && AI <= 45500) {
				System.out.println("the marginal tax rate 15%");
			} else if (AI >= 45501 && AI <= 117450) {
				System.out.println("the marginal tax rate 25%");
			}else if (AI >= 117451 && AI <= 190200) {
				System.out.println("the marginal tax rate 28%");
			}else if (AI >= 190201 && AI <= 372950) {
				System.out.println("the marginal tax rate 33%");
			}else if (AI >= 372951) {
				System.out.println("the marginal tax rate 35%");
			}
		} else {
			System.out.println("Display wrong status");
		}
	}

}
