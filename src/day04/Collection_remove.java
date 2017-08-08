package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素
 * boolean remove(E e)
 * @author tarena
 *
 */
public class Collection_remove {

	public static void main(String[] args) {
			Collection c = new ArrayList();
			
			c.add(new Point(1,2));
			
			c.add(new Point(3,3));
			
			c.add(new Point(4,6));
			
			c.add(new Point(1,2));
			
			Point p = new Point (1,2);
			
			System.out.println(c);
			
			boolean remove = c.remove(p);				//remove只删除给定相似对象，如果存在多个，只删除一次
			System.out.println(remove);					//根据元素equals比较的结果进行删除。
			System.out.println("删除后："+c);
	}

}
