package coding;

public class ReverseString {

	public static void main(String[] args) {
		String st = "Hello World!";
		String reverseString = " ";

		for (int i = st.length() - 1; i >= 0; --i) {
			reverseString += st.charAt(i);
		}
		System.out.println("Reversed String :" + reverseString);
	}

}
