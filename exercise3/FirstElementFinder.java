package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElementFinder {

	public static void main(String[] args) {
		List<Integer> numb = Arrays.asList(5, 2, 9, 1, 7, 4);
		Optional<Integer> firstElement = numb.stream().findFirst();

		if (firstElement.isPresent()) {
			System.out.println("First element :" + firstElement.get());
		} else {
			System.out.println("List is empty.");
		}

	}

}
