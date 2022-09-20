package forloop.day4;

//Count the odd no between 25 to 10 

public class OddCount {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=25;i>=10;i--){
			if(i%2!=0){
				count++;
				
			}
		}System.out.println(count);

	}

}
