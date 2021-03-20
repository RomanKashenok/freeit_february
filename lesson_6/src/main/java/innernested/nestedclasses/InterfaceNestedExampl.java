package innernested.nestedclasses;

/*
 * Класс, вложенный в интерфейс, статический по умолчанию.
*/
public interface InterfaceNestedExampl {
	int x = 10;

	class InnerInInterface {
		public void meth() {
			System.out.println("From static class defined into interface");
		}
	}
}
