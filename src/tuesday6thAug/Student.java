package tuesday6thAug;

public class Student{

	int id;
	String name;
	int m1,m2,m3;
	int avg;
	int total=0;
	
	public void acceptDetails(int i, String n,int mark1,int mark2,int mark3){
	    m1=mark1;
		 m2=mark2;
		 m3=mark3;
	   	id=i;
		name=n;
	}
	public void percent(){
		
	   total=m1+m2+m3;
	   avg=(total*100)/300;
		
	}
	public void display(){
		System.out.println("id is="+id+"name is="+name+" avg is="+avg+"total is="+total);
		
	}
	
	
	
	public static void main(String[] args) {

		Student s=new Student();
		s.acceptDetails(345, "jahangeer",20,30,40);
		s.percent();
		s.display();
	}

}
