package While;

//import java.util.Scanner;
//diplay no between 1 to 30 and skipped the no which is divisible by 3,2, and 9;

public class DisplayNo {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=30){
			
			
			if(i%3==0 || i%2==0 ||i%9==0){
			    
				i++;
				continue;
				
			}
			
		   System.out.println(i);
		   i++;
		
		}
		 
			
	}		
		}

	


