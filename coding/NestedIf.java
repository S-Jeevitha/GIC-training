package coding;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student grade:");
		char grade = sc.next().charAt(0);
		if (grade == 'A') {
			System.out.println("Excellent job!");
		} else if (grade == 'B') {
			System.out.println("Good Job!");
		} else if (grade == 'C') {
			System.out.println("Average job");
		} else if (grade == 'D') {
			System.out.println("Needs improvement");
		} else if (grade == 'F') {
			System.out.println("Failed");
		} else {
			System.out.println("Invalid grade");
		}
		
		sc.close();
	}
	

}
