package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 将集合或Map转换为线程安全的
 * @author tarena
 *
 */
public class SyncAip {

	public static void main(String[] args) {
		/*
		 * ArrayList,LinkedList都不是线程安全的
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * 将给定的List集合转换为线程安全的
		 */
		
		list = Collections.synchronizedList(list);
		
		System.out.println(list);
		/*
		 * 将给定的Set集合转换为线程安全的
		 */
		
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
		
		/*
		 * 将给定的Map集合转换为线程安全的
		 */
		Map<String ,String> map = new HashMap<String,String>();
		
		map = Collections.synchronizedMap(map);
		
		/*
		 * 线程安全的集合也不与迭代器遍历该集合的操作
		 * 互斥。但是迭代器要求遍历的过程中不能通过
		 * 集合的方法增删元素，否则会抛出异常，所以在
		 *多个线程间有这样的操作时，需要自行维护遍历
		 *集合与集合元素操作间的互斥关系 。
		 */
	}

}
