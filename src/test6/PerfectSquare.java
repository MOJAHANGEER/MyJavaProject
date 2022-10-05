package test6;



public class PerfectSquare {

	public static void perfectSquare(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<9;j++)
			{
				if(a[i]/j==j)
				{
					System.out.println(a[i]);
				}
			}
			{
				
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]={12,15,25,49,23,11,4};
		perfectSquare(arr);
	}

}
