package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * Collection�ṩ����ط�����toArray()
 * ���Խ���ǰ����ת��Ϊһ������
 * @author tarena
 *
 */
public class CollectionToArrayDemo {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		
		String [] array = c.toArray(new String[c.size()]);		
		
		for(String str:array){
			System.out.println(str);
		}
		
	}

}
