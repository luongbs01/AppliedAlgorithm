package training2;

import java.util.LinkedList;
import java.util.Scanner;

public class UnionofDoublyLinkedLists {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		LinkedList<LinkedList<Integer>> linkedList = new LinkedList<LinkedList<Integer>>();
		for (int i = 1; i <= n; i++) {
			LinkedList<Integer> temp = new LinkedList<Integer>();
			temp.add(scanner.nextInt());
			temp.add(i);
			temp.add(scanner.nextInt());
			linkedList.add(temp);
		}
	}
}
