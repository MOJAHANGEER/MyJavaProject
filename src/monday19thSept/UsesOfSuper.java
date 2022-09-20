package monday19thSept;

class Car {
	String name = "BMW";
	String gear = "Automatic";

}

class Oddi extends Car {
	String name = "Oddi";
	String gear = "Manual";

	Oddi(String name, String gear) {
		this.name = name;
		this.gear = gear;

	}

	void show() {
		System.out.print(" name of car is = " + super.name
				+ ", gear type is = " + super.gear);
	}
}

class OddiQ3 extends Oddi {
	int price = 4500000;

	OddiQ3(int price) {
		super("Oddi", "Manual");
	}

	void details() {
		System.out.println("The car is = " + name + " , gear is = " + gear
				+ " , and price is = " + price);
	}

	void show() {
		super.show();
		System.out.println(" and Price is = " + price);
	}
}

public class UsesOfSuper {

	public static void main(String[] args) {

		/*
		 * Oddi od=new Oddi(); od.show();
		 */

		OddiQ3 odd = new OddiQ3(230000);
		odd.details();
	}

}
