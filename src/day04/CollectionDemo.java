package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �����ڼ����е�Ӧ��
 * ���������涨������Ԫ������
 * @author tarena
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> c1 = new ArrayList<String>();
		
		c1.add("one");
		c1.add("two");
		c1.add("three");
		c1.add("four");
		
		System.out.println(c1);
		
		Iterator<String> it = c1.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		
		for (String str:c1){
			System.out.println(str);
		}
		
	}

}
