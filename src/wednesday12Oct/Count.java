package wednesday12Oct;

public class Count{

	public static void main(String[] args)
	{
		String str="Hello raipur";
		
		int sr=str.length();		//this is readymade function to count the character of string 
		System.out.println(sr);
		
		char ch[]=str.toCharArray();	//this is second way to count the no of character on digit
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			
			count++;
		}
		System.out.println("the no of character in string is ="+count);
	}
}
