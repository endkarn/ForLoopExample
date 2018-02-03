package TestingOnly;

public class ForLoopArray {

	public static void main(String[] args) {

		String[] arrayString = { "111", "222", "333", "444", "555" };

		System.out.println("ForEach Loop");
		for (String oneString : arrayString) {
			System.out.println(oneString);

			String test = oneString;
		}

		System.out.println("\nFor Loop");
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println(arrayString[i]);

			String test = arrayString[i];
		}

	}

}
