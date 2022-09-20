package thursday15sept;

class Address
{
	private String state;
	private String city;
	private int pinCode;
	private String street;
	private int houseNo;
	
	public void setState(String state)
	{
		this.state=state;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setPinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	public void setStreet(String street)
	{
		this.street=street;
	}
	public void setHouseNo(int houseNo)
	{
		this.houseNo=houseNo;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public String getStreet() {
		return street;
	}
	public int getHouseNo() {
		return houseNo;
	}
	
}


class Persn
{
	private int id;
	private String name;
	private float hight;
	private Address addr;
	
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
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}


public class PersonByGetSet {

	public static void main(String[] args) {
		
		Persn p=new Persn();
		p.setId(101);
		p.setName("Aamir");
		p.setHight(6.5f);
		p.setAddr(new Address());
		p.getAddr().setState("Chhattisgarh");
		p.getAddr().setCity("Raipur the capital of c.g.");
		p.getAddr().setPinCode(492010);
		p.getAddr().setStreet("Jama masjid kota raipur");
		p.getAddr().setHouseNo(1104);
		
		System.out.println("person name is ="+p.getName()+" ID is= "+p.getId()+" hight is ="+p.getHight()
				+" State is ="+p.getAddr().getState()+" city is ="+p.getAddr().getCity()
				+" pin code is ="+p.getAddr().getPinCode()+" street is ="+p.getAddr().getStreet()+
				" and house no is ="+p.getAddr().getHouseNo());
	}

}
