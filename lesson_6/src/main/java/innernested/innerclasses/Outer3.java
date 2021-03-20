package innernested.innerclasses;

import java.util.Date;

//Внутренние классы не могут содержать static-полей, кроме final static.

public class Outer3 {
	private Inner inner;
	private String str;
	private Date date;

	public void callMethodInInner() {
		inner.method();
		System.out.println(Inner.prfsi_pole);
		System.out.println(Inner.pubfsi_pole);
	}

	public class Inner {
		private int i;
//		public static int static_pole = 5;
		public final static int pubfsi_pole = 22;

		private final static int prfsi_pole = 33;
		public void method() {
			System.out.println(str);
			System.out.println(date.getTime());
		}

	}
}