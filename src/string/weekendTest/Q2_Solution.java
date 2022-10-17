package string.weekendTest;

/*take a string as "i like india country" and display it as 
@
@ l@ke
@ l@ke @nd@a
@ l@ke @nd@a country
*/

public class Q2_Solution {

	public static void main(String[] args) {
		
		String st="i like india country";
		st=st.replaceAll("i", "@");
		String str[]=st.split(" ");
		String str1="";
		for(int i=0;i<str.length;i++)
		{
			str1=str1+" "+str[i];
			System.out.println(str1);
		}

	}

}
