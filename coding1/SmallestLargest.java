package coding1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			int numbers = sc.nextInt();
			num.add(numbers);
		}

		Integer secondSmallest = num.stream().distinct().sorted().skip(1).findFirst().orElse(null);

		Integer secondLargest = num.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(null);

		System.out.println("Entered numbers : " + num);
		System.out.println("Second Smallest is :" + secondSmallest);
		System.out.println("Second Largest is : " + secondLargest);

		sc.close();

	}

}
