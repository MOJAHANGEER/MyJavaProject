package monday19thSept;

class Movie
{
	String name;
	int year;
	String actor;
}
class Kgf extends Movie
{
	Kgf(String name, int year,String actor)
	{
		this.name=name;
		this.year=year;
		this.actor=actor;
	}
	public String toString()
	{
		return "The Movie is = "+ name+" and its Releasing year is = "+year+ " and the actor is = "+actor;
	}
}
class Dhoom3 extends Movie
{
	void dispaly()
	{
		name="Dhoom3";
		year=2014;
		actor="Aamir khan";
		
		System.out.println("The movie is = "+name+ " Releasing in the year of = "+year+ " and actor in that movie is = "+actor);
	}
}

public class Multilevel4 {

	public static void main(String[] args) {
		
		Kgf k = new Kgf("KGF",2019,"Yash");
		System.out.println(k.toString());
		
		Dhoom3 d=new Dhoom3();
		d.dispaly();

	}

}
