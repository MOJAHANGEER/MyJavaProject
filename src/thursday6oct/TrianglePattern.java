package thursday6oct;

public class TrianglePattern {

	public static void trianglePattern(char [][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
	
		char a[][]=new char[4][4];
		
		TrianglePattern.trianglePattern(a);

	}

}
