package com.autoshop.application;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		/**
		 * Creating Instance of Sedan: sedan with speed, regularPrice, color, length
		 */
		Sedan sedan = new Sedan(120, 120000, "Red", 15);
		/**
		 * Creating 2 instances of Ford with Speed, regularPrice, color, year and
		 * manufactururDiscount
		 */
		Ford fordOne = new Ford(240, 72000.00, "White", 2015, 9);
		Ford fordTwo = new Ford(280, 85000.00, "Grey", 2016, 20);

		/**
		 * Creating instance of Car with Speed, regularPrice and color
		 */
		Car car = new Car(150, 50000.00, "white");
		/**
		 * Pringting Sales Price of all vehicles calling getSalePrice methods of their
		 * classes for respective instances
		 */
		System.out.println("Saden sales price is : " + sedan.getSalePrice());
		System.out.println("Ford One sales price is : " + fordOne.getSalePrice());
		System.out.println("Ford Two sales price is : " + fordTwo.getSalePrice());
		System.out.println("Car sales price is :  " + car.getSalePrice());
	}
}
