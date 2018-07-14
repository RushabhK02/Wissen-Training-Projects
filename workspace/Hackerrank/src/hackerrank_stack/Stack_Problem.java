package hackerrank_stack;

import java.util.*;

class Stack_Problem {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		String input;
		while (sc.hasNext()) {
			input = sc.nextLine();
			int i = 0;
			while (i < input.length()) {
				if ((Character.toString(input.charAt(i)) == "{") || (Character.toString(input.charAt(i)) == "[")
						|| (Character.toString(input.charAt(i)) == "(")) {
					stack.push(input);
				} else {
					if (!stack.empty()) {
						if (stack.peek().equals("}")) {
							System.out.println("false");
						}
						if (stack.peek().equals(")")) {
							System.out.println("false");
						}
						if (stack.peek().equals("]")) {
							System.out.println("false");
						}
					} else if (stack.empty()) {
						if ((Character.toString(input.charAt(i)) == "}") || (Character.toString(input.charAt(i)) == ")")
								|| (Character.toString(input.charAt(i)) == "]")) {
							System.out.println("false");
						}
					} else if (input == "}") {
						if (stack.peek().equals("{")) {
							stack.pop();
						}
					} else if (input == ")") {
						if (stack.peek().equals("(")) {
							stack.pop();
						}
					} else if (input == "]") {
						if (stack.peek().equals("[")) {
							stack.pop();
						}
					}
				}
			}
			if (stack.empty()) {
				System.out.println("true");
			}
		}
		
	}
}
