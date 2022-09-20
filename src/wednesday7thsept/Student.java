package wednesday7thsept;

public class Student {
	
	public int id;
	String name;
	private String address;
	protected int roll;
	
	void identity(int i)
	{
		id=i;
	}
	public void naming(String n)
	{
		name=n;
	}
	private void addrr(String addr)
	{
		address=addr;
	}
	protected void rll(int r)
	{
		roll=r;
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+address+" "+roll);
	}
	
	

	public static void main(String[] args) {
		
		Student st=new Student();
		
	/*	System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.address);
		System.out.println(st.roll);*/
		
	/*	st.identity(111);
		st.naming("jahangeer");
		st.addrr("Raipur");
		st.rll(12341234);
		st.display();   */
		
		

	}

}
