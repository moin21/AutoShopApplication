package com.autoshop.application;

/**
 * 
 * @author Moinuddin
 *
 */
public class Ford extends Car {
	/**
	 * year - Year of manufacture of the Ford. manufacturerDiscount - Discount from
	 * Manufacturer.
	 */
	int year;
	int manufacturerDiscount;

	/**
	 * Constructor:
	 * 
	 * @param speed                - Speed of Ford.
	 * @param regularPrice         - Regular Price of Ford.
	 * @param color                - Color of the Ford.
	 * @param year                 - Year of manufacture of the Ford.
	 * @param manufacturerDiscount - Discount from Manufacturer.
	 */
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		/**
		 * From Super Class
		 */
		super(speed, regularPrice, color);
	}

	/**
	 * We return the price after subtracting the manufacturerDiscount
	 */
	public double getSalePrice() {
		return super.getSalePrice() - manufacturerDiscount;
	}
}