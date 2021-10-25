package training2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class POSTMAN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<Long, Long> treeMap = new TreeMap<Long, Long>();
		int n = scanner.nextInt();
		long k = scanner.nextLong();
		long x, m;
		for (int i = 0; i < n; i++) {
			x = scanner.nextLong();
			m = scanner.nextLong();
			treeMap.put(x, m);
		}
		long ans = 0, temp = 0, key, value;
		Map.Entry<Long, Long> entry;
		while (!treeMap.isEmpty()) {
			entry = treeMap.lastEntry();
			if (entry.getKey() < 0)
				entry = treeMap.firstEntry();
			key = entry.getKey();
			value = entry.getValue();
			if (temp == 0) {
				temp = k;
				if (value % k == 0) {
					treeMap.remove(key);
					ans += Math.abs(key) * 2 * (value / k);
					temp = 0;
					continue;
				}
				ans += Math.abs(key) * 2 * (value / k + 1);
				treeMap.put(key, value % k);
				value %= k;
			}
			if (temp < value) {
				treeMap.put(key, value - temp);
				temp = 0;
			} else if (temp == value) {
				treeMap.remove(key);
				temp = 0;
			} else {
				treeMap.remove(key);
				if (!treeMap.isEmpty())
					if (key * treeMap.lastKey() < 0)
						temp = 0;
					else {
						temp -= value;

					}
			}
		}
		System.out.println(ans);
	}
}
