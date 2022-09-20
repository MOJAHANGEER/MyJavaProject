package thursday15sept;

class Engine
{
	String enType;
	int power;
	
	Engine(String enType,int power)
	{
		this.enType=enType;
		this.power=power;
	}
	void show()
	{
		System.out.println(enType+ " "+power);
		
	}
	
}
class Gear
{
	int noOfGear;
	String type;
	
	Gear(int noOfGear,String type)
	{
		this.noOfGear=noOfGear;
		this.type=type;
	}
	void show()
	{
		System.out.println(noOfGear+" "+type);
	}
}
class Car
{
	int modelNo;
	String name;
	Engine eng;
	Gear g;
	
	
	Car(int modelNo, String name,Engine eng, Gear g)
	{
		this.modelNo=modelNo;
		this.name=name;
		this.eng=eng;
		this.g=g;
	}
	void display_car()
	{
		//eng.show();
		System.out.println(" car name is= "+name+". Power of engine is="+eng.power+". model no is="+modelNo+". engine type is= "+eng.enType+". no of gear is "+g.noOfGear+". gear is automatic or manual ="+g.type);
		//g.show();
	}
}
public class ContainmentCar {

	public static void main(String[] args) {
		
		Engine en=new Engine("automatic",1600);
		
		Gear gr=new Gear(6,"Automatic");
		
		
		Car c=new Car(4,"creta",en,gr);
		c.display_car();
		

	}

}
