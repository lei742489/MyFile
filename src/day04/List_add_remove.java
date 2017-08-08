package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List支持用下标操作元素方法二：
 * 
 * @author tarena
 *
 */
public class List_add_remove {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
	
		/*
		 * void add(int index,E e)
		 * 将给定元素插入指定位置
		 * 
		 */
		
		list.add(2,"3");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * 将给定位置的元素从集合中删除，并将该元素返回。
		 */
		String old = list.remove(2);
		System.out.println(list);
		System.out.println(old);
	}

}
