package test5;

class Department
{
	private String name;
	private String  Addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	
	
}
class GetterSetter
{
	private int id;
	private String name = "Hi";
	private boolean isManager;
	private float salary;
	Department dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsManager() {
		return isManager;
	}

	public void setIsManager(boolean isManager) {
		this.isManager = isManager;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
		
		GetterSetter gs=new GetterSetter();
		gs.setId(786);
		gs.setName("Aamir");
		gs.setIsManager(true);
		gs.setSalary(13000.00f);
	
		Department dept=new Department();
		dept.setName("avanti vihar ");
		dept.setAddr("behind marine drive raipur");
		
		System.out.println(gs.getId()+" "+gs.getName()+" "+gs.getIsManager()+" "+gs.getSalary()+ " "+dept.getName()+" "+dept.getAddr());
		

	}

}
