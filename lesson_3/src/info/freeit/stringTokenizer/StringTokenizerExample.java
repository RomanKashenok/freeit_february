package info.freeit.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	static String example2 = "Java; 1332 = true";
	static String example3 = "     Test string for,tokenizer, ,   delimeters; presented     ";

	public static void main(String args[]) {
	    example3 = example3.trim();

//        StringTokenizer st = new StringTokenizer(example3, " ,;-{}");
//
//        List<String> wordsList = new ArrayList<>();
//
//		while (st.hasMoreTokens()) {
//			wordsList.add(st.nextToken());
//		}
//		wordsList.forEach(System.out::println);

//		String example = "Java 1332 true";
//
//		StringTokenizer st = new StringTokenizer(example, " "); // What if constructor without " " ?
//
//		String word = st.nextToken();
//		int number = Integer.parseInt(st.nextToken());
//		boolean flag = Boolean.parseBoolean(st.nextToken());
//
//		System.out.println(word);
//		System.out.println(number);
//		System.out.println(flag);

	}
}
