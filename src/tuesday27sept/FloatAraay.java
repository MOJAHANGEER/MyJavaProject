package tuesday27sept;

import java.util.Arrays;
import java.util.Scanner;

public class FloatAraay {

	public static void main(String[] args) {
		
	//	float arr[] = {12.30f,34.78f,123.45f,76.90f,89.34f};
		
		float ar[]= new float[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any element");
		for(int i = 0;i<ar.length;i++)
		{
			ar[i]=sc.nextFloat();
		}
		System.out.println("........");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("*******");
		
	/*	for(float a:ar)
		{
			System.out.println(a);
		}*/
//		System.out.println(Arrays.toString(ar));

	}

}
