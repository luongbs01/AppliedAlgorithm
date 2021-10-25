package training1;

import java.util.Scanner;

public class SUBSEQMAX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxi = 0, ai;
		int ans = Integer.MIN_VALUE;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			ai = scanner.nextInt();
			maxi = Math.max(ai, ai + maxi);
			ans = Math.max(ans, maxi);
		}
		System.out.println(ans);
	}
}
