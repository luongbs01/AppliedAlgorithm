package training3;

import java.math.BigInteger;
import java.util.Scanner;

public class CNKRM {
	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("1");
		BigInteger bigInteger2 = new BigInteger("1");
		BigInteger bigInteger3 = new BigInteger("1");
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int m = n - k;
		for (int i = 1; i <= n; i++) {
			bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
			if (i == k)
				bigInteger2 = bigInteger.multiply(new BigInteger("1"));
			if (i == m)
				bigInteger3 = bigInteger.multiply(new BigInteger("1"));
		}
		bigInteger = bigInteger.divide(bigInteger2);
		bigInteger = bigInteger.divide(bigInteger3);
		System.out.println(bigInteger.remainder(new BigInteger("1000000007")));
	}
}
