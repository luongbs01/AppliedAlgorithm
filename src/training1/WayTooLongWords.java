package training1;

import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String string;
		for (int i = 0; i < n; i++) {
			string = scanner.next();
			if (string.length() < 11) {
				System.out.println(string);
			} else {
				System.out.print(string.charAt(0));
				System.out.print(string.length()-2);
				System.out.print(string.charAt(string.length()-1));
				System.out.println();
			}
		}
	}
}
