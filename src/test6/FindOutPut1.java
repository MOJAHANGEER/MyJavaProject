package test6;

public class FindOutPut1 {
	
	static int mcCartyCounter =100;
	public static int mcCarthy(int n) {
	mcCartyCounter++;
	if (n > 100)
	return n - 10;
	else
	return mcCarthy(n+11);
	}

	public static void main(String[] args) {
		
		System.out.println (mcCarthy(100) + "  " + mcCartyCounter);

	}

}
