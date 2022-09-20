package tuesday13sept;

class CalculateAr
{
	float PI=3.14f;
	public void  area(int width,int hight)
	{
		System.out.println("This is area of rectangle ="+(width*hight));
	}
	public void  area(int r)
	{
		System.out.println("This is area of circle= "+PI*r*r);
	}
	public void  area(int width,float hight)
	{
		System.out.println("This is area of square= "+(hight*width));
	}
	public void area(float width,float hight)
	{
		System.out.println("This is area of triangle="+(hight*width)*0.5);
	}
}


public class AreaCalculation {

	public static void main(String[] args) {
		
		CalculateAr ca=new CalculateAr();
		ca.area(4);
		ca.area(4.0f, 4.5f);
		ca.area(6,7);
		ca.area(7,7.7f);

	}

}
