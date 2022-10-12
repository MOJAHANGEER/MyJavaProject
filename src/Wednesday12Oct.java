
public class Wednesday12Oct {

	public static void main(String[] args) {
		
		String str="HelloPune";				//creating object by using literal(it save in String constant pool).
		
		String str1=new String("Pune");	    //creating object by using new keyword.(it save in heap memory).
		
		str1="Hello"+str1;					//concatenation
		
		//System.out.println(str+" "+str1);
		
		
		System.out.println(str1.length());	//for find length of string.
		
		System.out.println(str1.indexOf("ll"));    //to know index of given character or a string.
		
		
		//.CompareTo() method for comparing two string
	/*	
		System.out.println(str.compareTo(str1)==0);
		System.out.println("Both are equal");
		System.out.println(str.compareTo(str1)>0);
		System.out.println("str is greater than str1");
		System.out.println(str.compareTo(str1)<0);
		System.out.println("str is less than str1");
		*/
		
		//for search sub string subString(startIndex, endIndex);
		
		System.out.println(str1.substring(1,6));
		
		//toUpperCase() for converting all string in upper case;
		
		System.out.println(str1.toUpperCase());
		
		//toLowerCase() for convereting all string in lower case;
		
		System.out.println(str1.toLowerCase());
		
		//.equals() for finding both are equal or not.
		if(str.equals(str1))
		{
			System.out.println("both are equal");
			
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		
		
		
		

	}

}
