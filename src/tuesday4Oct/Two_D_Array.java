package tuesday4Oct;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		
		// first way to create 2-D array
		
		/*int [][]arr={{1,2,3},
				{3,2,1},
				{4,3,2}};
				
				*/
		//Second way to create and intialize the 2-D array
	
	/*	int [][]arr=new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		*/
		
		//Talke input from user 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		int [][]arr=new int[3][3];
		
		for(int k=0;k<arr.length;k++)
		{
			for(int j=0;j<arr[k].length;j++)
			{
				arr[k][j]=sc.nextInt();
			}
	
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		}

	}

