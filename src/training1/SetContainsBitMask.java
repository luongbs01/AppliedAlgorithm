package training1;

import java.util.Scanner;
import java.util.TreeSet;

public class SetContainsBitMask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		TreeSet<Integer> a = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}
		int m = scanner.nextInt();
		TreeSet<Integer> b = new TreeSet<Integer>();
		for (int i = 0; i < m; i++) {
			b.add(scanner.nextInt());
		}
		if (a.containsAll(b)) System.out.println(1);
		else System.out.println(0);
	}
}
