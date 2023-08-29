package exercise;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(5);
		num.add(6);

		int sum = 0;
		for (int n : num) {
			sum += n;
		}
		System.out.println("Sum of integer : " + sum);

	}

}
