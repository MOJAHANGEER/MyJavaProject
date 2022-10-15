package thursday13Oct.String;

import java.util.Scanner;

public class ShortName {

	public static void sName(String s)
	{
		String st[]=s.split(" ");
		String s2="";
		for(int i=0;i<st.length-1;i++)
		{
			s2=s2+st[i].charAt(0)+".";
			
		}
		s2=s2+st[st.length-1];
		System.out.print(s2);
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		ShortName.sName(name);

	}

}
