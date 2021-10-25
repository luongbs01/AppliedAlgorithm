package training1;

import java.util.Scanner;
import java.util.TreeMap;

public class SMS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer T = Integer.parseInt(scanner.nextLine());
		String[] group = { "adgjmptw ", "behknqux", "cfilorvy", "sz" };
		for (int i = 0; i < T; i++) {
			String string = scanner.nextLine();
			TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
			for (int j = 0; j < string.length(); j++) {
				if (!map.containsKey(string.charAt(j))) {
					map.put(string.charAt(j), 0);
				}
				map.put(string.charAt(j), map.get(string.charAt(j)) + 1);
			}
			int ans = 0;
			for (int j = 0; j < group.length; j++) {
				for (int k = 0; k < group[j].length(); k++) {
					if (map.containsKey((group[j].charAt(k)))) {
						ans += map.get(group[j].charAt(k)) * (j + 1);
					}
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + ans);
		}
	}
}
