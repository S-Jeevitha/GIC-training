package coding1;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		System.out.println("Enter the number of Integers : ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " Integers:");
		for (int i = 0; i < n; i++) {
			int numbers = sc.nextInt();
			num.add(numbers);
		}
		double average = num.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("Average :" + average);
		sc.close();



	}

}
