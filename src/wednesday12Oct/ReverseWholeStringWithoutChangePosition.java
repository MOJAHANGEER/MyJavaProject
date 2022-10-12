package wednesday12Oct;

public class ReverseWholeStringWithoutChangePosition {

	public static String reverseString(String str)
	{
		String st="";
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++){
			String word=str1[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				st=st+word.charAt(j);
			}
			st=st+" ";
			
		}
		return st;
	}
	public static void main(String[] args) {
		
		String str="Hello mo jahangeer ashraf";
		
		System.out.println(ReverseWholeStringWithoutChangePosition.reverseString(str));
		

	}

}
