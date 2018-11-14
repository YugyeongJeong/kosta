package kosta.data;

import java.util.LinkedList;

public class StackExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList<Integer> stack = new LinkedList<Integer>();
		// stack.addLast(new Integer(12));
		// stack.addLast(new Integer(59));
		// stack.addLast(new Integer(7));
		// while(!stack.isEmpty()) {
		// Integer num = stack.removeLast();
		// System.out.println(num);
		// }

		LinkedList<String> queue = new LinkedList<>();
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		while (!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}

}
