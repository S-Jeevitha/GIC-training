package coding;

public class WithReverse {

	public static void main(String[] args) {
		String word = "Eclipse";
		String reverse = reverseString(word);
		System.out.println("Reversed String: " + reverse);
	}

	public static String reverseString(String word) {
		StringBuilder str = new StringBuilder(word);
		return str.reverse().toString();
	}

}
