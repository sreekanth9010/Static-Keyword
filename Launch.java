package staticKeyword;

public class Launch {
	
	
	static int a,b,c;
	
static
{
	System.out.println("Static block");
	a=10;
	b=20;
	c=30;
	
}


static void disp()
{
	System.out.println("static method");
	System.out.println(a);
	System.out.println(b);

	System.out.println(c);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Launch.disp();
	}

}
