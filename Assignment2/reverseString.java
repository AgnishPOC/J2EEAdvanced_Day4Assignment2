package Day4.Assignment2;

import java.util.Scanner;

public class reverseString {

	// Function to reverse the string
	public static String reversed(String toReverse) {
		String reversed = "";
		int len = toReverse.length();
		for (int i = 0; i < toReverse.length(); i++) {
			reversed = reversed + toReverse.charAt(len - i - 1);
		}
		return reversed;
	}

	public static void main(String[] args) {

		System.out.println("Enter the string you want to reverse : ");
		Scanner scan = new Scanner(System.in);
		String toReverse = scan.next(); // Storing the String which is to be reversed
		scan.close();

		System.out.println("Reversed String :" + reverseString.reversed(toReverse)); // Printing the reversed String

	}
}
