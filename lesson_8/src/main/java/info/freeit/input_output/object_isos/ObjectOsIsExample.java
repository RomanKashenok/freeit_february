package info.freeit.input_output.object_isos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOsIsExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Cat vaska = new Cat("Vaska", "Gray", 4);
		System.out.println(vaska.hashCode());
		System.out.println(vaska);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vaskaserialized.dat"));

		oos.writeObject(vaska);

		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vaskaserialized.dat"));

		try {
			Cat serializedVaska = (Cat)ois.readObject();
			System.out.println(serializedVaska.hashCode());
			System.out.println(serializedVaska);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			oos.close();
			ois.close();
		}

	}
}
