package com.autoshop.application;

public class Truck extends Car {
	int weight;
	double amount;

	/**
	 * Created constructor with variables of the class and parent class
	 * 
	 * @param speed        - Speed of the truck
	 * @param regularPrice - Price of the truck
	 * @param color        - Color of the truck
	 * @param weight       -Weight of the truck
	 */
	public Truck(int speed, double regularPrice, String color, int weight) {
		/**
		 * From Super Class
		 */
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	/**
	 * Method to check discounted price of the truck. If weight>2000,10% discount.
	 * Else 20% discount. Then calculate discounted amount salePrice = discount
	 * subtracted from regular price. return salePrice
	 */
	public double getSalePrice() {
		double salePrice, discount;

		if (weight > 2000) {
			System.out.println("\n Truck's weight is greater than 2000: 10% discount");
			discount = regularPrice * 10 / 100;
			System.out.println(" Discount amount is : " + discount);

		} else {
			System.out.println("\n Truck has a discount of 20% discount");
			discount = regularPrice * 20 / 100;
			System.out.println(" Discount amount is : " + discount);

		}
		/**
		 * Selling Price = discount subtracted from regular price
		 */
		salePrice = regularPrice - discount;
		return salePrice;
	}
}
