package methodAssignment;

public class ClassObject {
	
	int id;
	String name;
	
	void details()
	{
		id=12;
		name="jahangeer";
		
	}

	public static void main(String[] args) {
		
		ClassObject co=new ClassObject();
		co.details();
		System.out.println(co.id);
		System.out.println(co.name) ;

	}

}
