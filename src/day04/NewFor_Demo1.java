package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环，又称为：新循环, for each
 * 该循环是自jdk1.5以后推出的一个新特性
 * 新循环只用来遍历集合或数组使用.
 * @author tarena
 *
 */
public class NewFor_Demo1 {

	public static void main(String[] args) {
		
		String[] array = {"one","two","three","four","five"};
		
		//遍历数组
		for(String str1:array){
			System.out.println(str1);
		}
		
		//遍历集合
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		
		/*
		 * 新循环并非新语法，这是编译器认可而非虚拟机认可的。
		 * 编译器会编译源代码时发现使用新循环遍历集合时将代码改变为使用迭代器遍历。
		 * 所以要注意，使用新循环遍历集合时不要使用集合的方法修改元素。
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
		}
		
		
	}

}
