package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合的集合操作
 * @author tarena
 *
 */
public class Collection_addAll {

	public static void main(String[] args) {
			
		Collection<String> c1 =  new HashSet<String>();
		
		c1.add("java");
		
		c1.add("C++");
		
		c1.add("PHP");
		
		Collection<String> c2 = new ArrayList<String>();
		
		c2.add("C#");
		
		c2.add(".net");
		
		c2.add("java");
		
		boolean boo = c1.addAll(c2);			//set集合，重复元素不再添加
		
		System.out.println(c1+":"+boo);
		
		boolean boo1 = c2.addAll(c1);			//List集合，重复元素可以添加
		
		System.out.println(c2+":"+boo1);
		
		
		Collection<String> c3 = new ArrayList<String>();
		
		c3.add("java");
		c3.add("C++");
		c3.add(".net");
		
		/*
		 * boolean containsAll (Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		
		boolean contains = c2.containsAll(c3);
		System.out.println("全包含："+contains+":"+c2);
		
		/*
		 * removeall
		 * 删除c2中所有和c3一样的元素
		 */
		
		boolean removeall = c2.removeAll(c3);
		
		System.out.println("移除后："+removeall+":"+c2);
	}

}
