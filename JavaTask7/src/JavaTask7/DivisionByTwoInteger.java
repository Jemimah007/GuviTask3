package JavaTask7;

import java.util.Scanner;

public class DivisionByTwoInteger {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int num1 = scr.nextInt();

		System.out.println("Enter 2nd number :");
		int num2 = scr.nextInt();
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException ae) {

			ae.printStackTrace();
		}
		System.out.println("Error occurs");

	}

}
