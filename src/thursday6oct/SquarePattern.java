package thursday6oct;

public class SquarePattern {
	
	public static void squarePattern(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]='*';
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		
		char arr[][]= new char[3][3];
		SquarePattern.squarePattern(arr);
		
	}

}
