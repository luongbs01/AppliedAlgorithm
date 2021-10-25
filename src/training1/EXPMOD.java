package training1;

import java.math.BigInteger;
import java.util.Scanner;

public class EXPMOD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		BigInteger a = new BigInteger(string);
		string = scanner.next();
		BigInteger b = new BigInteger(string);
		System.out.println(a.modPow(b, new BigInteger("1000000007")));
	}
}
