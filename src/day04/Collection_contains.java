package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains (E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 * @author tarena
 *
 */
public class Collection_contains {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(3,4));
		
		Point P = new Point (1,2);				//Point�������д��equals�������ȵ���Point��Equals�����Ƚϡ�
		
		boolean contains = c.contains(P);
		
		System.out.println(contains);
	}

}
