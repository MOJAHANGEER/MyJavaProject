package wednesday14thSept;

class Prime
{
	int i=1;
	int j=2;
	double avg=0;
	double count=0;
	double sum=0;
	
public void primeNo()
{
	for( i=1;i<20;i++)
	{
		
		boolean isPrime=true;
		for(j=2;j<i;j++)
		{
			if(i%j==0){
			isPrime=false;
			break;
			}
		}
		if(isPrime==true)
		{
			count++;
			sum=sum+i;
			System.out.println(i);
		}
		
	}
	System.out.println(sum);
}

public  void display()
{
	avg=(sum/count);
	System.out.println("The average of 1 to 20 prime numbers ="+avg);
}

}
public class PrimeAverage {

	public static void main(String[] args) {		

		Prime p=new Prime();
		p.primeNo();
		p.display();
	}

	}


