package training2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Queue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		TreeMap<Long, Long> treeMap = new TreeMap<Long, Long>();
		LinkedList<ArrayList<Long>> linkedList = new LinkedList<ArrayList<Long>>();

		Long[] a = new Long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
			treeMap.put(a[i], (long) i);
		}
		Iterator<Map.Entry<Long, Long>> iterator = treeMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Long, Long> entry = iterator.next();
			ArrayList<Long> arrayList = new ArrayList<Long>();
			arrayList.add(entry.getKey());
			arrayList.add(entry.getValue());
			linkedList.add(arrayList);
		}
		for (int i = 0; i < n; i++) {
			while (i > linkedList.peekFirst().get(1))
				linkedList.pollFirst();
			System.out.print((linkedList.peekFirst().get(1) - i - 1) + " ");
		}
	}
}
