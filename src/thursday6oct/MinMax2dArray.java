package thursday6oct;

import java.util.Scanner;

// find min in row wise
public class MinMax2dArray {
	
	public static void minRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				
			}
			System.out.print(min);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]={{1,2,3},
				{4,5,6},
				{6,7,8}};
		
	/*	for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
			arr[i][j]=sc.nextInt();
		}
		}
		*/
		
		MinMax2dArray.minRow(arr);
		

	}

}
