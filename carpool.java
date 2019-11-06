package com.perscholas;

import java.util.Scanner;

public class carpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int cars; int passengers; int cars_not_driven; int cars_driven; int drivers;
		double space_in_a_car; double carpool_capacity; double average_passengers_per_car;
		double average_miles_driven; double average_miles_per_gallon; double gas_cost_per_gallon; double money_saved; double gas_cost_per_trip;
		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		average_miles_driven = 29.2;
		average_miles_per_gallon = 23.6;
		gas_cost_per_gallon = 2.517;
		
		cars_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car;
		average_passengers_per_car = passengers / cars_driven; //ratio
		gas_cost_per_trip = (average_miles_driven * gas_cost_per_gallon)/ average_miles_per_gallon;
		money_saved = (gas_cost_per_trip * cars)/(gas_cost_per_trip *cars_driven)	;
		
		System.out.println("There are " + cars + " cars available.\r\n" + 
				"There are only " + drivers + " drivers available.\r\n" + 
				"That means there will be " + cars_not_driven + " empty cars today!\r\n" + 
				"We can transport " + carpool_capacity + " people today.\r\n" + 
				"Out of that, we're transporting " + passengers + " today.\r\n" + 
				"So we'll need to put about " + average_passengers_per_car + " in each car.\r\n" + 
				"Long story short, today, we'll be saving about $" + money_saved +  " !");
		
		
		
				
		

	}

}
