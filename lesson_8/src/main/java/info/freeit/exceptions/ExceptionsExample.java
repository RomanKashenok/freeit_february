package info.freeit.exceptions;


import java.io.FileNotFoundException;
import java.util.Date;

public class ExceptionsExample {
	
	
	public static void main(String[] args) throws ArrayIndexException {
		int[] myintArray = new int[5];

			try {
				for (int i = 0; i <= myintArray.length; i++) {
					if (i == 5) {
						throw new ArrayIndexException("WERCVBWDGVSILBVOEFBJ");
					}
					int a = myintArray[i];
					System.out.println(a);
				}
			} catch (ArrayIndexException | ArithmeticException | IndexOutOfBoundsException ex) {
				System.out.println("Runtime Exception appeared");
				System.out.println(ex.getLocalizedMessage());
			} finally {
				System.out.println("From finally block");
			}

		
		
	}
}
