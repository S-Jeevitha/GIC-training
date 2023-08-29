package exercise3;

import java.util.Arrays;
import java.util.List;

public class TotalElementCounter {

	public static void main(String[] args) {
		List<Integer> numb = Arrays.asList(5, 2, 9, 1, 7, 4);
		long totalCount = numb.stream().count();

		System.out.println("Total number of elements :" + totalCount);

	}

}
