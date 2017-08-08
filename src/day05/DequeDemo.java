package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque
 * 双端队列接口继承自Queue接口
 * 常用实现类：java.util.LinkedList
 * 所谓双端队列就是两端都可以做入队和出队操作
 * @author tarena
 *
 */
public class DequeDemo {

	public static void main(String[] args) {

		Deque <String> deque = new LinkedList<String>();
		
		deque.add("one");
		deque.add("two");
		deque.add("three");
		deque.add("four");
		
		System.out.println(deque);
		
		deque.addFirst("five");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
		System.out.println(deque.peekLast());
		System.out.println(deque);
	}

}
