package test3;

public class SingleLoopPattern {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=5;i++)
		{
			if(i==1)
			{
				System.out.println(i);
			}
			else if(i==2)
			{
				System.out.print(i);
				System.out.println(i);
			}
			else if(i==3)
			{
				System.out.print(i);
				System.out.print(i);
				System.out.println(i);
			}
			else if(i==4)
			{
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.println(i);
			}
			else
			{
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
			}
		}
		
	}

}
