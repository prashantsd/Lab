package String;

public class StringBufferLab {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("This is a String Buffer");

		// add the string
		str.append(" Enhance Version of String ");
		System.out.println(str);

		// insert string "Object" at 21st position
		str.insert(21, "Object");
		System.out.println("After insertion : " + str);

		// reverse the string
		str.reverse();
		System.out.println(str);

		// replace the word "Buffer" with "Builder"
		StringBuffer sb = new StringBuffer("This is String Buffer ");
		sb.replace(15, 22, "Builder");
		System.out.println("After replacing : " + sb);
	}

}
