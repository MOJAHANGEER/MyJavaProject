package test6;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void remove(int a[])
	{
		int d[]=new int[10];
		int m=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean isPresent=false;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					isPresent=true;
					break;
				}
			}
		if(isPresent==false)
		{
			for(int k=i+1;k<a.length;k++)
			{
				if(a[i]==a[k])
				{
					count++;
					break;
				}
			}
			count++;
			d[m]=a[i];
			m++;
		}
		}
		System.out.println(count);
		for(int i=0;i<m;i++)
		{
			System.out.println(d[i]);
		
		}
		//System.out.println(Arrays.toString(d));
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,2,3,2,4,5};
		remove(arr);

}
}
