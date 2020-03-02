package strings;

public class StringExample {

	public static void main(String[] args) {

		String value = "This is basic JavA Class";
		System.out.println("Length of string = " + value.length());
		char[] chars = value.toCharArray();

		for (char c : chars) {
			System.out.print(c + " ");
		}
		System.out.println();

		char c = value.charAt(15);
		System.out.println("Character at index 15:== " + c);
		System.out.println("Contain java word == " + value.contains("java"));
		System.out.println("Lowercase == " + value.toLowerCase());
		System.out.println("Uppercase == " + value.toUpperCase());
		System.out.println("Contains java word case insensitive == " + value.toLowerCase().contains("java"));

//		for (int i = 0; i <= chars.length; i++) {
//			System.out.println(chars(i) + " ");
//		}
	}

}
