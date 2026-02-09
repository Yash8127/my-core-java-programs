package com.array;

public class BuyAndSellStock {

	private static void maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		int minDay = 0;
		int buyDay = 0;
		int sellDay = 0;
		System.out.println("\nDay\tPrice\tMinPrice\tProfit\tMaxProfit");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < prices.length; i++) {
			int price = prices[i];
			// Update minimum buying price
			if (price < minPrice) {
				minPrice = price;
				buyDay = i + 1;
			}
			// calculate profit if sold today
			int profit = price - minPrice;
			// update maxprofit
			if (profit > maxProfit) {
				maxProfit = profit;
				minDay = buyDay;
				sellDay = i + 1;
			}

			System.out.println((i + 1) + "\t" + price + "\t" + minPrice + "\t\t" + profit + "\t" + maxProfit);
		}

		System.out.println("\nMaximum Profit = " + maxProfit);

		if (maxProfit > 0)
			System.out.println("Buy on Day " + buyDay + " and Sell on Day " + sellDay);
		else
			System.out.println("No profitable transaction possible");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] prices = { 2, 1, 5, 6, 3, 4, 99 };
		maxProfit(prices);

	}

}
