package training1;

import java.util.Scanner;
import java.math.BigInteger;

public class ALICEADD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		BigInteger a = new BigInteger(string);
		string = scanner.nextLine();
		BigInteger b = new BigInteger(string);
		System.out.println(a.add(b));
	}
}
