package data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		queue.offer("고양이의 보은");
		queue.offer("개구리");
		queue.offer("리트리버");

		System.out.println(queue.peek());

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
