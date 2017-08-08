package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ���У���ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��
 * ����ʵ���ࣺ
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
		 * �Ӷ��׻�ȡԪ�أ����Ӳ�����;
		 * ִ�к��Ԫ�ػ�Ӷ�����ɾ����
		 */
		
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * ���ö���Ԫ�أ���ȡ����Ԫ�غ󲻻Ὣ��Ԫ�شӶ�����ɾ��)
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		//ʹ�õ���������queue,����ɾ��Ԫ��
		
		for (String s : queue){
			System.out.println(s);
		}
		
		System.out.println(queue);
		
		//ʹ��ѭ����������һ���Ե�
		
		while(queue.size()>0){
			String str1 = (queue.poll());
			System.out.println(str1);
		}
		System.out.println(queue);
	}

}
