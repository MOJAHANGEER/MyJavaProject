package string.weekendTest;

/*Write a Program to show the use of StringBuffer and StringBuilder functions?
(mention at least five functions)*/


public class Q7_Solution {

	public static void main(String[] args) {
		
		//StringBuffer sb=new StringBuffer("Jahangeer");
		
		StringBuilder sb=new StringBuilder("Jahangeer");
		
		System.out.println(sb.capacity());
		System.out.println(sb.append("Asharf"));
		System.out.println(sb.reverse());
		System.out.println(sb.indexOf("A"));
		System.out.println(sb.length());
		
		
	}

}
