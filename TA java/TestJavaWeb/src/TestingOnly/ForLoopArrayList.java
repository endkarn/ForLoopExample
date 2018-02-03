package TestingOnly;

import java.util.ArrayList;

public class ForLoopArrayList {

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<String>();

		stringList.add("123456");
		stringList.add("222222");
		stringList.add("333333");
		stringList.add("654321");

		System.out.println("ForEach Loop");
		for (String textString : stringList) {
			System.out.println(textString);

			String test = textString;
		}

		System.out.println("\nFor Loop");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));

			String test = stringList.get(i);

		}

	}	

}
