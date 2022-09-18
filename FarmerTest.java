package staticKeyword;

import java.util.Scanner;

class Farmer
{
	private float p;
	private float t;
	private static float r;
	private float si;
	
	static
	{
		r=2.5f;
		
	}
	public void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a,mount needed:");
		p=sc.nextFloat();
		System.out.println("Enter the time to repay needed:");
		t=sc.nextFloat();
		
	}
	public float compute()
	{
		si=(p*t*r)/100;
		return si;
	}
	
}
public class FarmerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		f1.acceptInput();
		System.out.println(f1.compute());
		f2.acceptInput();
		System.out.println(f2.compute());
		

	}

}
