package forloop.day4;

public class TableOneTwoFive {

	public static void main(String[] args) {
	
	/*	for(int one=1;one<=10;one++){
			System.out.print(" "+one);
		}
		System.out.println(" ");
		for(int two=2;two<=20;two++){
			
			System.out.print(" "+two);
			two++;
		}
			System.out.println(" ");
			for(int three=3;three<=30;three=three+2){
				
				System.out.print(" "+three);
				three++;	
		}
			System.out.println(" ");
			for(int four=4;four<=40;four=four+3){
				
				System.out.print(" "+four);
				four++;
			}
			System.out.println(" ");
			for(int five=5;five<=50;five=five+4){
				
				System.out.print(" "+five);
				five++;
			}*/
		
		int num=1;
		System.out.println("Tables");
		for (int i=1;i<=5;i++){
			for(int j=1;j<=10;j++){
				num=i*j;
				System.out.println(num);
			}
			System.out.println("***********");
		}
	}
	
}
