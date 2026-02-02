package com.DailyTask;

public class ShoppingCart {
	String itemName;
	double price;
	int quantity;
	double total;
	double discountAmount;
	
	static{
		System.out.println("shopping system intialized");
	}
	double calculateTotal(){
		total = price * quantity;
		return total;
	}
	double applyDiscount() {
		discountAmount= total * 0.1;
		return discountAmount;	
	}
	public static void main(String[] args) {
		ShoppingCart itemNo1 = new ShoppingCart();
		itemNo1.itemName= "Headphones";
		itemNo1.price = 5000;
		itemNo1.quantity=2;
		itemNo1.calculateTotal();
		itemNo1.applyDiscount();
		double finalAmount1 = itemNo1.total - itemNo1.discountAmount;
		System.out.println("*****************************");
		System.out.println(" Headphones Total cost ₹"+itemNo1.total);
		System.out.println(" Headphones Discount ₹"+itemNo1.discountAmount);
		System.out.println(" Final cost ₹"+ finalAmount1);
		ShoppingCart itemNo2 = new ShoppingCart();
		itemNo2.itemName= "AC";
		itemNo2.price = 30000;
		itemNo2.quantity=2;
		itemNo2.calculateTotal();
		itemNo2.applyDiscount();
		double finalAmount2 = itemNo2.total - itemNo2.discountAmount;
		System.out.println("*******************************");
		System.out.println(" AC Total cost ₹"+itemNo2.total);
		System.out.println(" AC Discount ₹"+itemNo2.discountAmount);
		System.out.println(" Final cost ₹"+ finalAmount2);
	}

}
