package coding;

//import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int number = 5;
		int result = factorial(number);
		System.out.println("factorial of" + number + "is:" + result);
	}
//		int i = 1, fact = 1, num;
//		System.out.println("Enter the number to find factorial:");
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//
//		while (i <= num) {
//			fact = fact * i;
//			i++;
//		}
//		System.out.println("Factorial of the number is :" + fact);
//		sc.close();
//	}

}
