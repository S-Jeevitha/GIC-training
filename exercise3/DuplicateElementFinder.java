package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementFinder {

	public static void main(String[] args) {
		List<Integer> numb = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 9, 10, 1);

		List<Integer> duplicateNumbers = numb.stream()
				.collect(Collectors.groupingBy(number -> number, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());

		System.out.println("Duplicate numbers : " + duplicateNumbers);

	}

}
