package monday3oct;

import java.util.Arrays;

// print the reverse array;

public class ReverseArray {
	
	public static void reverse(int []a)
	{
	int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		reverse(a);

}
}
