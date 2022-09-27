package thursday22sept;
/*
interface Addable
{
	int x=10;
}
abstract class Add{
	int y=29;
}
class Addition extends Add implements Addable
{
	int res=0;
	void addition()
	{
		res=x+y;
		System.out.println(res);
	}
}
*/
class Emp
{
	int id;
	String name;
	float salart;
	void show_deatails()
	{
		System.out.println("hii");
	}
}

public class AbstractClassInterfaceAddition  {

	public static void main(String[] args) {
		
		/*Addition ad=new Addition();
		ad.addition();
		*/
		
		Emp em=new Emp();
       System.out.println(em);
       em.show_deatails();

	}

}
