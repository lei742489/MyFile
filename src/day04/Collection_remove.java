package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ɾ������Ԫ��
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
			
			boolean remove = c.remove(p);				//removeֻɾ���������ƶ���������ڶ����ֻɾ��һ��
			System.out.println(remove);					//����Ԫ��equals�ȽϵĽ������ɾ����
			System.out.println("ɾ����"+c);
	}

}
