package test6;

import java.util.Arrays;

public class Replace0With1 {

	public static void replace0(int a[])
	{
		for(int i=0;i<a.length;i++)
		{ 
			if(a[i]==0)
			{
				int temp=1;
				a[i]=temp;
			}
			else if(a[i]%10==0)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		
		int arr[]={1,2,3,0,3,0,20,1};
		replace0(arr);

	}

}
