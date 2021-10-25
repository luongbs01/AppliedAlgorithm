package training2;

import java.util.ArrayList;
import java.util.Scanner;

public class SIGNAL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> max_left = new ArrayList<Integer>();
		ArrayList<Integer> max_right = new ArrayList<Integer>();
		int res = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
		int n = scanner.nextInt(), b = scanner.nextInt();
		int temp;
		for (int i = 0; i < n; i++) {
			temp = scanner.nextInt();
			a.add(temp);
			max = Math.max(max, temp);
			max_left.add(max);
		}
		max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, a.get(n - i - 1));
			max_right.add(max);
		}
		for (int i = 1; i < n - 1; i++) {
			if (max_left.get(i - 1) - a.get(i) >= b && max_right.get(n - i - 1) - a.get(i) >= b) {
				res = Math.max(res, max_left.get(i - 1) + max_right.get(n - i - 1) - 2 * a.get(i));
			}
		}
		if (res > Integer.MIN_VALUE)
			System.out.println(res);
		else
			System.out.println(-1);
	}
}