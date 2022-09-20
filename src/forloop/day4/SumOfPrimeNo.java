package forloop.day4;

//diplay prime no between 1 to 20 and sum of even no.

public class SumOfPrimeNo {

	public static void main(String[] args) {
		
		int  sum=0;
		for(int i=1;i<20;i++){
			int temp=i;  
			boolean isPrime=true;
			for(int num=2;num<i;num++){
				
				if(i%num==0){
					isPrime=false;
					break;
				}
				
			}
			
			if(isPrime==true){
				
				sum=sum+temp;
				
			}
		}System.out.println(sum);
	}

}
