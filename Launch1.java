package staticKeyword;

public class Launch1 {
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
	int m,n,o;
	
	{
		System.out.println("non static block");
		m=100;
		n=200;
		o=300;
	}
	
	public Launch1() {
		System.out.println("in constructor");
	}
	{
		System.out.println("in non static block");
	}
	void displ()
	{
		System.out.println("non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Launch1.disp();
		Launch1 l = new Launch1();
		l.displ();

	}

}
