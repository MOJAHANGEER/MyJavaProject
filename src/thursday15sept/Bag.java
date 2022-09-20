package thursday15sept;

class Pen {
	private int price;
	private String colour;

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}
}

class BagBrand {
	private String brandName;
	private int price;
	private Pen p;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

}

public class Bag {

	public static void main(String[] args) {

		BagBrand b = new BagBrand();
		b.setBrandName(" Sky bag");
		b.setPrice(4600);

		b.setP(new Pen());
		b.getP().setColour("Red");
		b.getP().setPrice(150);
		System.out.println(b.getBrandName() + " " + b.getPrice() + " "
				+ b.getP().getColour()+" "+b.getP().getPrice());
		 
	//this is second another method to call method of pen class.

		Pen pn=new Pen();
		pn.setColour(" Blue bag");
		pn.setPrice(150);
		System.out.println(pn.getPrice()+" "+pn.getColour());

	}

}
