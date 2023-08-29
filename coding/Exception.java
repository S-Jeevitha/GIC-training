package coding;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int i;
		i = sc.nextInt();
		num(i);
		sc.close();
	}

	public static void num(int i) {
		try {
			checkEvenNumber(i);
			System.out.println("The given number " + i + " is even");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException:" + e.getMessage());
		}
	}

	public static void checkEvenNumber(int num) {
		if (num % 2 != 0) {
			throw new IllegalArgumentException("The given number " + num + " is odd");
		}
	}
}
