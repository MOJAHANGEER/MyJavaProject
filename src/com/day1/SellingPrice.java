package com.day1;

public class SellingPrice {

	public static void main(String[] args) {
		
		int cp =20;
		System.out.println("this is your costprice ="+ cp);
		
		int gain= 20;
		System.out.println("this is your gain in percentage ="+gain);
		
		float sp = ((100+gain) /100f) * cp;
		System.out.println("this is the selling price by gainig 20% of costprice="+sp);


	}

}
