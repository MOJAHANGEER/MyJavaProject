package test4;

public class NumbersBetween100And400 {

	public static void main(String[] args) {
		
		int r=0;
		int temp=0;
		int count=0;
		for(int i=100;i<=400;i++)
		{
			temp=i;
			count=0;
			while(temp>0)
			{
				r=temp%10;
				if(r%2==0)
				{
					count++;
					
				}
				temp=temp/10;
				
			}
			if(count==3)
			{
			System.out.println(i);
			}
		}
		
	}

}
