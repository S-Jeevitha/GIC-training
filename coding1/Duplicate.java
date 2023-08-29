package coding1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		System.out.println("Enter the number of integers:");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " integer");
		for (int i = 0; i < n; i++) {
			int numbers = sc.nextInt();
			num.add(numbers);
		}

		List<Integer> duplicateNumbers = num.stream().distinct().collect(Collectors.toList());

		System.out.println("Entered Numbers : " + num);
		System.out.println("Number without duplicates :" + duplicateNumbers);
		sc.close();

	}

}
