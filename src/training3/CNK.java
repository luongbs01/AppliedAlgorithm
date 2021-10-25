package training3;

import java.math.BigInteger;
import java.util.Scanner;

public class CNK {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int j = 0; j < T; j++) {
			long n = scanner.nextLong();
			long k = scanner.nextLong();
			long m = scanner.nextLong();
			BigInteger bigInteger = new BigInteger(String.valueOf(n - k + 1));
			for (long i = 2; i <= k; i++) {
				bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(n - k + i)));
				bigInteger = bigInteger.divide(new BigInteger(String.valueOf(i)));
			}
			System.out.println(bigInteger.remainder(new BigInteger(String.valueOf(m))));
		}
	}
}
