package thursday6oct;

//Sum Of 2-d array row wise and columm wise;

import java.util.Arrays;

public class SumOfArrayColumm {

	/*
	public static void sumOfRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]);
			}
			System.out.println(" ="+sum);
		}
		*/
	public static void sumOfColumm(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[j][i];
				System.out.print(a[i][j]);
			}
			System.out.println(" ="+sum);
		}
		
	}
	public static void main(String[] args) {
		
		int arr[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
		
	//	SumOfArrayColumm.sumOfRow(arr);
	  	
		SumOfArrayColumm.sumOfColumm(arr);

	}

}
