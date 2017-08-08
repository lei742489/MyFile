package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains (E e)
 * 判断当前集合是否包含给定元素
 * @author tarena
 *
 */
public class Collection_contains {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(3,4));
		
		Point P = new Point (1,2);				//Point对象的重写了equals，所以先调用Point的Equals方法比较。
		
		boolean contains = c.contains(P);
		
		System.out.println(contains);
	}

}
