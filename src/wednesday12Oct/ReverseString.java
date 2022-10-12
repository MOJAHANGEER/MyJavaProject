package wednesday12Oct;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="hello";			
		String st="";
		
		
		/*for(int i=str.length()-1;i>=0;i--)			//first way to reverse a string
		{
			st=st+str.charAt(i);
		}*/
		
		/*for(int i=0;i<str.length();i++)					//this is second way to reverse a string
		{
			st=str.charAt(i)+st;
		}*/
		
		/*char ch[]=str.toCharArray();						//this is third way to reverse a string
		for(int i=ch.length-1;i>=0;i--)
		{
			st=st+ch[i];
		}*/
		
		char ch[]=str.toCharArray();						//this is fourth way to reverse a string
		int j=ch.length-1;
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			j--;
			
		}
		String str2=new String(ch);
		System.out.println(str2);
		System.out.println(st);

	}

}
