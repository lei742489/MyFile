package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列，存取元素必须遵循先进先出原则
 * 常用实现类：
 * LinkedList
 * 
 * @author tarena
 *
 */
public class QueueDemp {

	public static void main(String[] args) {

		Queue <String> queue = new LinkedList<String>();
		
		queue .offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
			
		System.out.println(queue);
		
		/*
		 * E poll()
		 * 从队首获取元素（出队操作）;
		 * 执行后该元素会从队列中删除。
		 */
		
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * 引用队首元素（获取队首元素后不会将该元素从队列中删除)
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		//使用迭代器遍历queue,不会删除元素
		
		for (String s : queue){
			System.out.println(s);
		}
		
		System.out.println(queue);
		
		//使用循环遍历则是一次性的
		
		while(queue.size()>0){
			String str1 = (queue.poll());
			System.out.println(str1);
		}
		System.out.println(queue);
	}

}
