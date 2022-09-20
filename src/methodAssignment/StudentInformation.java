package methodAssignment;


class Stud
{
	int id;
	String name;
	
	public void displayData()
	{
		this.id=111;
		this.name="pradeep";
		
		System.out.println(id+ " "+name);
		//getId(123);
		System.out.println(getId(123));
		
	}
	public void customData(int customId,String customName)
	{
		System.out.println(customId+" "+ customName);
	}
	public int getId(int id)
	{
		return id;
	}
	
}

public class StudentInformation {

	public static void main(String[] args) {
		
		Stud st=new Stud();
		st.displayData();
		st.customData(113, "Jahangeer");
		
		
		
		
		

	}

}
