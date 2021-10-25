package training2;

import java.util.LinkedList;
import java.util.Scanner;

public class WATERJUG {
	static LinkedList<LinkedList<Integer>> linkedList = new LinkedList<LinkedList<Integer>>();
	static boolean check[][] = new boolean[1000][1000];

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int a, b, c, first, second, third, temp;
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			add(0, 0, 0);
			while (!linkedList.isEmpty()) {
				first = linkedList.getFirst().get(0);
				second = linkedList.getFirst().get(1);
				third = linkedList.getFirst().get(2);
				if (first == c || second == c)
					break;
				third++;
				linkedList.removeFirst();
				if (first < a) {
					add(a, second, third);
					if (b > 0) {
						temp = Math.min(a - first, second);
						add(first + temp, second - temp, third);
					}
				} else
					add(0, second, third);
				if (second < b) {
					add(first, b, third);
					if (a > 0) {
						temp = Math.min(first, b - second);
						add(first - temp, second + temp, third);
					}
				} else
					add(first, 0, third);
			}
			if (linkedList.isEmpty())
				System.out.println(-1);
			else
				System.out.println(linkedList.getFirst().get(2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void add(int a, int b, int c) {
		LinkedList<Integer> LinkedList = new LinkedList<Integer>();
		LinkedList.add(a);
		LinkedList.add(b);
		LinkedList.add(c);
		if (check[a][b] == false)
			linkedList.addLast(LinkedList);
		check[a][b] = true;
	}
}
