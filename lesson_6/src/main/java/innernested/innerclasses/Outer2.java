package innernested.innerclasses;

import java.util.Date;

// Доступ к элементам внутреннего класса возможен только из внешнего класса через
// объект внутреннего класса.

public class Outer2 {
	private Vasya vasya;
	private String str;
	private Date date;

	Outer2() {
		str = "string in outer";
		date = new Date();
		vasya = new Vasya();
	}
	
	public void callMethodInInner() {
		Vasya i = new Vasya();
		i.method();
		vasya.method();
	}

	
	class Vasya {
		public void method() {
			System.out.println(str);
			System.out.println(date.getTime());
		}
		
	}

}
