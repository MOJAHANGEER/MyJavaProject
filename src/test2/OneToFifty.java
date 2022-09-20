package test2;

public class OneToFifty {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.println(i);
			}
			else{
				System.out.println("-"+(i*i));
			}
		}

	}

}
