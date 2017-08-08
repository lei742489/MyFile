package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * 集合存放的是元素的引用
 * @author tarena
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {

			Collection c = new ArrayList();
			
			Point p = new Point();
			p.setX(1);
			p.setY(2);
			
			c.add(p);
			System.out.println("c:"+c);
			System.out.println("P:"+p);
			
			p.setX(4);
			System.out.println("c:"+c);
			System.out.println("P:"+p);
			
				
	}

}
