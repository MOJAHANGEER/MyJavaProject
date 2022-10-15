package thursday13Oct.String;

public class PalindromeStringBuffer {

	public static void main(String[] args) {
		
		String s="hello";
		
		StringBuffer sb=new StringBuffer(s);
		
		
		System.out.println(sb.reverse());
		
		String s2=sb.toString();
		if(s.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
