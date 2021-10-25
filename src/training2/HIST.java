package training2;

import java.util.Scanner;
import java.util.LinkedList;

public class HIST {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		while ((n = scanner.nextInt()) != 0) {
			long l[] = new long[n];
			for (int i = 0; i < n; i++) {
				l[i] = scanner.nextLong();
			}
			System.out.println(process(l, n));
		}
	}

	static long process(long l[], int n) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		long ans = 0, max_area, width;
		int i = 0, temp;
		while (i < n) {
			if (linkedList.isEmpty() || l[linkedList.peekLast()] <= l[i]) {
				linkedList.addLast(i);
				i++;
			} else {
				temp = linkedList.pollLast();
				if (linkedList.isEmpty())
					width = i;
				else
					width = i - linkedList.peekLast() - 1;
				max_area = l[temp] * width;
				ans = Math.max(ans, max_area);
			}
		}
		while (!linkedList.isEmpty()) {
			temp = linkedList.pollLast();
			if (linkedList.isEmpty())
				width = i;
			else
				width = i - linkedList.peekLast() - 1;
			max_area = l[temp] * width;
			ans = Math.max(ans, max_area);
		}
		return ans;
	}
}
