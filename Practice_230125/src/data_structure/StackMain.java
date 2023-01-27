package data_structure;

import java.util.Iterator;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		stack.push("안뇽");
		stack.push("요네즈 켄시");
		stack.push("야스오즈 켄시");

		System.out.println();
		System.out.println(stack.peek());

		Iterator<String> it = stack.iterator();

		System.out.println();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println();
		while (!stack.isEmpty()) {

			System.out.println(stack.pop());

		}

	}

}
