package initialization;

public class Parent
{
	static int a = 1;
	static int b;
	int c = 3;
	int d;
	final int e = 5;
	final int f;

	static
	{
		System.out.println("from static block. a = " + a + " and b = " + b);
		b = 2;
		System.out.println("a = " + a + " and b = " + b);
	}

	{
		System.out.println("from NON static block. c = " + c + " and d = " + d + " and e = " + e + " and f = " /*+ f*/);
		d = 4;
		f = 6;
		System.out.println("c = " + c + " and d = " + d + " and e = " + e + " and f = " + f);
	}
	public Parent()
	{
		System.out.println("Parent constructor");
		System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f);
	}
}
