package string.weekendTest;

import java.util.Arrays;
import java.util.Scanner;

/*5.	How to sort String on their length.
E.g. I Love UK Country
Output -Country Love UK I*/

public class Q5_Solution {
	
	public static void sortByLength(String str)
	{
		String st[]=str.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j>st.length;j++)
			{
				if(st[i].length() > st[j].length())
				{
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
				else if(st[i].length() > st[j].length())
					{
					if(st[i].compareTo(st[j]) < 0)
					{
						String t=st[i];
						st[i]=st[j];
						st[j]=t;		
					}
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {
		
		System.out.println("Enter some string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Q5_Solution.sortByLength(str);
		
		
	}

}
