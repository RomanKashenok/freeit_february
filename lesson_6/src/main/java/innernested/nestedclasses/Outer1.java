package innernested.nestedclasses;

public class Outer1 {
	public int        nonStatic = 3;
	public static int staticVar = 4;

	/*
	 * Статический вложенный класс для доступа к нестатическим членам и методам
	 * внешнего класса должен создавать объект внешнего класса.
	 */
	static class Inner1 {
		public void method() {
			Outer1 out = new Outer1();
			System.out.println("From Inner1: Outer1.nonStatic=" + out.nonStatic);
			System.out.println("From Inner1: Outer1.nonStatic=" + staticVar);
		}
	}

	/*
	 * Вложенный класс имеет доступ к статическим полям и методам внешнего
	 * класса.
	 */
	static class Inner2 {
		public void method() {
			System.out.println("From Inner2: Outer1.staticVar=" + staticVar);
//			 System.out.println("nonStatic="+nonStatic); // ERROR
//			Outer1 out = new Outer1();
//			System.out.println("From Inner2: Outer1.nonStatic=" + out.nonStatic);
		}
	}

	/*
	 * Статический метод вложенного класса вызывается при указании полного
	 * относительного пути к нему.
	 */
	static class Inner3 {
		public static void method() {
			System.out.println("From Inner3 static method");
		}
		public void printMe(){
			System.out.println("From non static method Inner3");
		}
	}

	/*
	 * Подкласс вложенного класса не наследует возможность доступа к членам
	 * внешнего класса, которым наделен его суперкласс.
	 */
	static class Inner4 {
		public static void method() {
			System.out.println("From Inner4: Outer1.staticVar=" + staticVar);
		}
	}

}
