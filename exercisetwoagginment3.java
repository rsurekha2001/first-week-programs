package com.perscholas;

import java.util.Scanner;

public class exercisetwoagginment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner assgn = new Scanner(System.in);
        int i;
        int a = assgn.nextInt();
        
        for(i = 1; i < 11; i++)
        		{
        	System.out.println(a + " * " + i + " = " + (a * i));
        }
        	assgn.close();	
	}

}
