package coding1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CaseConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> word = new ArrayList<>();
		System.out.println("Enter the number of words:");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " words");
		for(int i =0; i<n ;i++) {
			String words = sc.next();
			word.add(words);
		}

		System.out.println("Enter 'U' to convert to uppercase or 'L' to convert to lowercase: ");
		char choice = sc.next().charAt(0);
		
		List<String> convertedWords = word.stream().map(str -> choice == 'U' ? str.toUpperCase() : str.toLowerCase())
				.collect(Collectors.toList());
		
		System.out.println("Entered Words : " + word);
		System.out.println("Converted words: " +convertedWords );
		
		sc.close();
		
	}

}
