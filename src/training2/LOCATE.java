package training2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class LOCATE {
	static int T, L, C;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			L = scanner.nextInt();
			C = scanner.nextInt();
			ArrayList<Integer> pre = new ArrayList<Integer>();
			ArrayList<Integer> pos = new ArrayList<Integer>();
			for (int j = 0; j < L * C; j++) {
				if (scanner.nextInt() == 1) {
					pre.add(j);
				}
			}
			for (int j = 0; j < L * C; j++) {
				if (scanner.nextInt() == 1) {
					pos.add(j);
				}
			}
			System.out.println(Math.max(process(pre, pos), process(pos, pre)));
		}
	}

	static int process(ArrayList<Integer> pre, ArrayList<Integer> pos) {
		int ans = -1;
		TreeSet<Integer> posTreeSet = new TreeSet<Integer>(pos);
		for (int i = 0; i < L * C; i++) {
			TreeSet<Integer> preTreeSet = new TreeSet<Integer>();
			for (int j = 0; j < pre.size(); j++) {
				preTreeSet.add(pre.get(j) + i + 1);
			}
			preTreeSet.retainAll(posTreeSet);
			ans = Math.max(ans, preTreeSet.size());
		}
		return ans;
	}
}
