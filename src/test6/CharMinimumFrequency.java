package test6;

//find out the minimum frequency of character in array;

public class CharMinimumFrequency {
	
	public static void main(String[] args) {

		
		char arr[] = {'a','b','c','c','d','d','b'};
		int min=Integer.MAX_VALUE;
		char ch=' ';
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			boolean isVisited=false;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]==arr[j])
				{
					isVisited=true;
					break;
					
			     }
			}
			if(isVisited==false)
			{
				/*
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
						count++;
						
					}
				}
				*/
				if(count<min)
				{
					min=count;
					ch=arr[i];
					
				}
				
			}
		}
				
		
		System.out.println(ch+" ");

	}
}

