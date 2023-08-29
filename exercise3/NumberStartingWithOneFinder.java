package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOneFinder {

	public static void main(String[] args) {
		List<Integer> numb = Arrays.asList(12, 23, 34, 145, 156, 1001, 2020, 110);
		List<Integer> numberStarting = numb.stream().filter(number -> String.valueOf(number).startsWith("1"))
				.collect(Collectors.toList());

		System.out.println("Numbers starting with 1 : " + numberStarting);

	}

}
