package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 栈也可以存储一组元素，但是存取元素必须遵循
 * 先进后出原则
 * @author tarena
 *
 */
public class StackDemo {

	public static void main(String[] args) {
			
		Deque <String> stack = new LinkedList<String>();
		//入栈操作
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		
		System.out.println(stack);
		
		//出栈操作
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		//遍历
		while(stack.size()>0){
			String str1 = stack.pop();
			System.out.println(str1);
		}
		System.out.println(stack);
	}

}
