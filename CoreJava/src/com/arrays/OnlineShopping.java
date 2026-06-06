package com.arrays;

class CartItem {
	int itemId;
	String itemName;
	double[] pricesFromSellers;
	
	public CartItem(int itemId, String itemName, double[] pricesFromSellers) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.pricesFromSellers = pricesFromSellers;
	}
	
	public double getLowerPrice() {
		double min = pricesFromSellers[0];
		for(int i=1;i<pricesFromSellers.length;i++) {
			if(pricesFromSellers[i] < min) {
				min = pricesFromSellers[i];
			}
		}
		return min;
	}
}

class ShoppingCart {
	
	CartItem[] items = new CartItem[5];
	int count = 0;
	
	public void addItem(CartItem item) {
		if(count < items.length) {
			items[count] = item;
			count++;
		}
	}
	
	public void displayCart() {
		System.out.println("---Cart Items---");
		for(int i=0;i<count;i++) {
			System.out.println("Item ID :" + items[i].itemId);
			System.out.println("Item Name : " + items[i].itemName);
			System.out.println("Get Lower Price : " + items[i].getLowerPrice());
			System.out.println("-----------------------");
		}
	}
	public double calculateTotalCost() {
		double total = 0;
		
		for(int i=0;i<count;i++) {
			total += items[i].getLowerPrice();
		}
		return total;
	}
}

public class OnlineShopping {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new CartItem(101, "IPhone", new double[]{50000, 52000, 51000}));
        cart.addItem(new CartItem(102, "Laptop", new double[]{60000, 58000, 59000}));
        cart.addItem(new CartItem(103, "Headphones", new double[]{2000, 1800, 1900}));
        cart.addItem(new CartItem(104, "Smartwatch", new double[]{8000, 7500, 8200}));
        cart.addItem(new CartItem(105, "Keyboard", new double[]{1500, 1400, 1600}));

        cart.displayCart();
        System.out.println("Total Cart Value (Lowest Prices): " + cart.calculateTotalCost());
	}

}
