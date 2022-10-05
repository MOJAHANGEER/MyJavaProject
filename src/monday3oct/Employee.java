package monday3oct;

public class Employee {
	
	int empId;
	String name;
	float salary;
	
	Employee(int id,String n,float s)
	{
		this.empId=id;
		this.name=n;
		this.salary=s;
	}
	
	public String toString()
	{
		return empId+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		
		Employee emp[]=new Employee[3];
		emp[0]=new Employee(1,"Aamir",15500.90f);
		emp[1]=new Employee(2,"Jahangeer",10000.12f);
		emp[2]=new Employee(3,"Tanveer",15500.89f);
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].salary<15000)
			{
				emp[i].salary=emp[i].salary*1.1f;
				
			}
		}
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}

}
