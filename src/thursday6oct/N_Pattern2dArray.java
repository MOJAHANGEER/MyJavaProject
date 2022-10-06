package thursday6oct;

public class N_Pattern2dArray {
	
	public static void N_pattern(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0|| (i==1 && j==1) || (i==2 && j==2)|| j==a[j].length-1)
				{
					a[i][j]='*';
					
				}
				else
				{
					a[i][j]=' ';
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		

		char a[][]=new char[4][4];
		N_Pattern2dArray.N_pattern(a);
	}

}
