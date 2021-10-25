package training2;

import java.util.LinkedList;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), a;
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			a = scanner.nextInt();
			if (a < 0)
				linkedList.add(a);
			else if (a > 0)
				linkedList2.add(a);
			else
				linkedList3.add(a);
		}
		if (linkedList2.size() == 0) {
			for (int i = 0; i < 2; i++) {
				linkedList2.add(linkedList.pollLast());
			}
		}

		if (linkedList.size() % 2 == 0) {
			linkedList3.addLast(linkedList.pollLast());
		}
		process(linkedList);
		process(linkedList2);
		process(linkedList3);
	}

	static void process(LinkedList<Integer> linkedList) {
		System.out.print(linkedList.size());
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(" " + linkedList.get(i));
		}
		System.out.println();
	}
}
