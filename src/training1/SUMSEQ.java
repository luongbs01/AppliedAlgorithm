package training1;

import java.math.BigInteger;
import java.util.Scanner;

public class SUMSEQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		BigInteger S = new BigInteger("0");
		for (int i = 0; i < n; i++) {
			String string = scanner.next();
			S = S.add(new BigInteger(string));
		}
		System.out.println(S.mod(new BigInteger("1000000007")));
	}
}

