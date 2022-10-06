package tuesday4Oct;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		
		int a[][]={{1,2},
				{3,4}};
		
		int b[][]={{5,3},
				{6,1}};
		
		int c[][]=new int[2][2];
		/*
		c[0][0]=(a[0][0])+(b[0][0]);
		c[0][1]=(a[0][1])+(b[0][1]);
		c[1][0]=(a[1][0])+(b[1][0]);
		c[1][1]=(a[1][1])+(b[1][1]);
		
		*/
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];				//- is used for substraction instead of +
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		
		}
		
		}

	}


