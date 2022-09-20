package thursday15sept;

class Vehicle
{
	int wheel;
	String name;
	String staring;
	
	Vehicle(int wheel,String name, String staring)
	{
		this.name=name;
		this.staring=staring;
		this.wheel=wheel;
		
	}
	public String toString()
	{
		return wheel+" "+name+" "+staring;
	}
}

class Empl
{
	int empID;
	String empName;
	float salary;
	Vehicle  v;
	
	Empl(int empID, String empName, float salary, Vehicle v)
	{
		this.empID=empID;
		this.empName=empName;
		this.salary=salary;
		this.v=v;
	}
	public String toString()
	{
		return empID+ " "+empName+" "+salary;
	}
	
}


public class EmployeeByConstructor {

	public static void main(String[] args) {
		
		//Empl em=new Empl(11,"Rashid",4000.00f);
		

	}

}
