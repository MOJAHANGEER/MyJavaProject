package forloop.day4;

//write a code to print 1 to 15 if there is any even no then print its qube and if it is odd then print as it is.
public class OneToFifteen {

	public static void main(String[] args) {
		
		for(int i=1;i<=15;i++){
			if(i%2==0){
				System.out.println(i*i);
			}else{
				System.out.println(i);
			}
		}

	}

}
