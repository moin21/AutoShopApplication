package com.autoshop.application;

/**
 * Super class car with variables speed, regularPrice and color Created a
 * parameterized constructor with these inputs Created a method getSalePrice
 * 
 * @author Moinuddin
 *
 */
public class Car {
	private int speed;
	protected double regularPrice;
	private String color;

	/**
	 * Parameterized constructor with input speed, price and color
	 * 
	 * @param speed        - Speed of the car
	 * @param regularPrice - Price of the car
	 * @param color        - Color of the car
	 */
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;

	}

	/**
	 * Method to return regular price of car
	 * 
	 * @return
	 */
	public double getSalePrice() {
		return regularPrice;
	}
}