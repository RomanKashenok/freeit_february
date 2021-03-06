package initialization;

public class Child extends Parent
{
	static int g = 1;
	static int h;
	int i = 3;
	int j;
	final int k = 5;
	final int l;

	static
	{
		System.out.println("from static block. g = " + g + " and h = " + h);
		h = 2;
		System.out.println("g = " + g + " and h = " + h);
	}

	{
		System.out.println("from NON static block. i = " + i + " and j = " + j + " and k = " + k + " and l = " /*+ l*/);
		j = 4;
		l = 6;
		System.out.println("i = " + i + " and j = " + j + " and k = " + k + " and l = " + l);
	}
	public Child()
	{
		System.out.println("Child constructor");
		System.out.println("g=" + g + ", h=" + h + ", i=" + i + ", j=" + j + ", k=" + k + ", l=" + l);
	}
}
