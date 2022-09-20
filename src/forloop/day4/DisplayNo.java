package forloop.day4;

public class DisplayNo {

	public static void main(String[] args) {
		/*for (int i=25;i>=15;i--){
			System.out.println(i);
		}*/
		
		/*for (int i=120;i>=75;i--){
		System.out.println(i);
	    }*/
		
		for (int i=1;i<=30;i++){
			if(i%2==0 || i%3==0 || i%9==0){
		     
				continue;
			}
			System.out.println(i);
			
		
		

		}
	}
}


