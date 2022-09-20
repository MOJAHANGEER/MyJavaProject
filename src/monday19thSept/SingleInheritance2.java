package monday19thSept;


class Country
{
	int country=303;
	String name="Inida";
}
class India extends Country
{
	void display()
	{
		System.out.println("There are country " +country+" in the world" + " but  we are from "+name+" country");
	}
	
}
public class SingleInheritance2 {

	public static void main(String[] args) {
		
		India ind=new India();
		ind.display();
		
	}

}
