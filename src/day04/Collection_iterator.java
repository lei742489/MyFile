package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素
 * 
 * Collection 提供了用于遍历集合元素的方法：
 * Iterator iterator()
 * 该方法返回一个可以用于遍历当前集合的迭代器
 * 
 * java.util.Iterator
 * 
 * 迭代器，本身是一个接口，规定了所有迭代器遍历集合的统一方法。不同的集合实现类都提供了一个迭代器的实现类
 * 用于遍历自身。我们无需关注具体迭代器的名字，只要将它看做是Iterator使用即可。
 * 
 * 使用迭代器遍历集合遵循：问，取，删的步骤，其中删除元素操作不是必须的。
 * @author tarena
 *
 */
public class Collection_iterator {

	public static void main(String[] args) {
			Collection c =new ArrayList();
			
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
			 * boolean hasNext()
			 * 通过迭代器判断集合是否还有元素可以遍历
			 */
			Iterator it = c.iterator();
		/*	int index =0;
			String [] strs ={};
			while(it.hasNext()){
				strs = Arrays.copyOf(strs, strs.length+1);
				strs[index] = (String) it.next();
				index++;
				
			}*/
			
			/*
			 * 使用迭代器遍历集合过程中不能通过集合的方法增删元素，否则迭代器在下次遍历元素时会抛出异常。可以通过迭代
			 * 器提供的remove方法删除通过newxt获取的元素
			 * 
			 */
			
			while(it.hasNext()){
				String str = (String)it.next();
				
				//System.out.println(str);
				//通过迭代器的remove方法删除#
				
				if("#".equals(str)){
					it.remove();
					}
				System.out.println(c);
			}
			
	}

}
