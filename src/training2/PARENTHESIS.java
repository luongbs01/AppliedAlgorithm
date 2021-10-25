package training2;

import java.util.Scanner;
import java.util.Stack;

public class PARENTHESIS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println(process(scanner.nextLine()));
		}
	}

	static int process(String string) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < string.length(); i++) {
			Character character = string.charAt(i);
			if (character == '(' || character == '[' || character == '{')
				stack.add(character);
			else if (character == ')')
				if (stack.empty())
					return 0;
				else if (stack.peek() == '(')
					stack.pop();
				else
					return 0;
			else if (character == ']')
				if (stack.empty())
					return 0;
				else if (stack.peek() == '[')
					stack.pop();
				else
					return 0;
			else if (character == '}') {
				if (stack.empty())
					return 0;
				else if (stack.peek() == '{')
					stack.pop();
				else
					return 0;
			}
		}
		if (stack.empty())
			return 1;
		else
			return 0;
	}
}
