package test2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n=20;
		int first=0;
		int second=1;
		for(int i=1;i<=n;i++){
			System.out.println(first);
			int next=first+second;
			first=second;
			second=next;
			
		}
		

	}

}
