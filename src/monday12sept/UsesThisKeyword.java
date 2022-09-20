package monday12sept;

class Student
{
	int id;
	String name;
	String address;
	int standard;
	
	Student(int id,String name, String address,int standard)
	{
	
		this.id=id;
		this.name=name;
		this.address=address;
		this.standard=standard;
		
	}
	Student()
	{
		this(111, "Sivam", "raipur chhattisgarh", 12);
		if(standard==12)
		{
			System.out.println("This person is present in this standard");
		}
		else
		{
			System.out.println("found another class");
		}
		  display();
      
	}

void display()
{
	System.out.println(this.id+" "+this.name+" "+this.address+" "+this.standard);
}
}
public class UsesThisKeyword {

	public static void main(String[] args) {
		
		Student s=new Student();
			
		Student st=new Student(112,"aamir","Raipur",12);
		
		st.display();
	}

}
