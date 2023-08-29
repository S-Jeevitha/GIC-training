package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFinder {

	public static void main(String[] args) {
		List<Integer> numb = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumber = numb.stream()
				.filter(number -> number % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("Even numbers : " + evenNumber);

	}

}
