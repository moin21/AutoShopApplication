package com.autoshop.application;

public class Sedan extends Car {
	private int length;

	/**
	 * Constructor :
	 * 
	 * @param speed        - Speed of Sedan.
	 * @param regularPrice of Sedan.
	 * @param color        - color of Sedan.
	 * @param length       - length of Sedan.
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		/**
		 * From Super Class
		 */
		super(speed, regularPrice, color);
		this.length = length;
	}

	/**
	 * discount - 10% default if length >20, discount = 5% return - SalePrice With
	 * Discount Included
	 */
	public double getSalePrice() {
		// calculating discount
		double discount = 10;
		if (length > 20) {
			discount = 5;
		}
		return super.getSalePrice() * (100 - discount) / 100;
	}
}