package forloop.day4;

//Prime no between 1 to 20

public class Prime2 {

	public static void main(String[] args) {
		 
		for(int num=1;num<=20;num++){
		
		     int n=num;
			 boolean isPrime=true;
			 for(int i=2;i<n;i++){
				  if(n%i==0){
				 isPrime=false;
				 break;
				  
			 }
		}
		if(isPrime==true){
		 
			
			
			System.out.println(n);
		
		}
		
		
          
	}
	}
	}
