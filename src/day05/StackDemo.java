package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ջҲ���Դ洢һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ
 * �Ƚ����ԭ��
 * @author tarena
 *
 */
public class StackDemo {

	public static void main(String[] args) {
			
		Deque <String> stack = new LinkedList<String>();
		//��ջ����
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		
		System.out.println(stack);
		
		//��ջ����
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		//����
		while(stack.size()>0){
			String str1 = stack.pop();
			System.out.println(str1);
		}
		System.out.println(stack);
	}

}
