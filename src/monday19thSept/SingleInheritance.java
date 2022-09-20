package monday19thSept;

class Bike
{
	String model="Duke 260" ;
	int speed =160;
}
class Duke extends Bike
{
	void show()
	{
	System.out.println(" Model is =" +model+" & Speed is = "+speed);
	}
	
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Duke d=new Duke();
		d.show();
		

	}

}
