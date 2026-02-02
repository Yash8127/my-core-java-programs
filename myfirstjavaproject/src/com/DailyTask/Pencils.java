package com.DailyTask;

public class Pencils {
	public static void main(String[] args) {
		int totalamount = 70;
		int pencilcost = 7;
		int noofpencils=70/7;
		int totalcost= noofpencils * pencilcost;
		int remaningamount= totalamount-totalcost;
		System.out.println("No of pencils "+noofpencils);
		System.out.println("Remaining Amount "+remaningamount);

		
	}

}
