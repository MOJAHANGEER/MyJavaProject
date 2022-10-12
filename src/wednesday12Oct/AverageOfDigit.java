package wednesday12Oct;

public class AverageOfDigit {
	
	public static void averageDigit(String str)
	{
		int sum=0;
		int average=0;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int x=Character.getNumericValue(ch);
				sum=sum+x;
				count++;
			}
		}
		average=sum/count;
		System.out.println(average);
	}

	public static void main(String[] args) {
		
		String st="Hello786 hii92";
		AverageOfDigit.averageDigit(st);
		

	}

}
