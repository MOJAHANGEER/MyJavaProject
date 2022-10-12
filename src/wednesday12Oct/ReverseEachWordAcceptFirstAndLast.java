package wednesday12Oct;

public class ReverseEachWordAcceptFirstAndLast {

	public static String reverseWord(String str)
	{
		String rev="";
		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			if((s[i]==s[0]) || (s[i]==s[3]))
			{
				for(int j=0;j<word.length();j++)
				{
					
					rev=rev+word.charAt(j);
				}
			rev=rev+" ";
			
			}
			else
			{
				for(int j=word.length()-1;j>=0;j--)
				{
					rev=rev+word.charAt(j);
				}
				rev=rev+" ";
			}
			
		
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		String str="hello mo jahangeer ashraf";
		System.out.println(ReverseEachWordAcceptFirstAndLast.reverseWord(str));
		
		

	}

}
