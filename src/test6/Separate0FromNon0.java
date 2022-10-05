package test6;

import java.util.Arrays;

public class Separate0FromNon0 {
	
	public static void seperateZeros(int a[])
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[j]==0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(a[j]!=0)
			{
				j++;
			}
			
		
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		
		int arr[]={1,0,2,0,3,0,4};
		
		seperateZeros(arr);
		
	}

}
