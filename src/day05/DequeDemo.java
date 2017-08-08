package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ˫�˶���
 * java.util.Deque
 * ˫�˶��нӿڼ̳���Queue�ӿ�
 * ����ʵ���ࣺjava.util.LinkedList
 * ��ν˫�˶��о������˶���������Ӻͳ��Ӳ���
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
