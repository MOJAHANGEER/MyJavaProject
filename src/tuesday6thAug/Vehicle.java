package tuesday6thAug;

public class Vehicle {
	
	int modelNO;
	String name;
	float price;
	

	public static void main(String[] args){
		
		Vehicle vc=new Vehicle();
		vc.modelNO=123;
		vc.name="BMW";
		vc.price=30000.00f;
		System.out.println("modelNo="+vc.modelNO+" \n"+"name of vehicle is="+vc.name+" \n"+"the price is = "+vc.price);
		
	}

}
