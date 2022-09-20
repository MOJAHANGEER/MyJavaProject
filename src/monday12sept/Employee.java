package monday12sept;


class Empl
{
	int id;
	String name;
	float salary;
	
	Empl(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		display();
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}



public class Employee {

	public static void main(String[] args) {
		
		Empl em=new Empl(101,"aryan",15400.0f);
		//em.display();
		
		Empl e=new Empl(102,"mohsin",15000.0f);
		//e.display();
		
		Empl emp=new Empl(101,"tanveer",15300.0f);
		//emp.display();
		

	}

}
