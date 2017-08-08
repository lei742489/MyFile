package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϵļ��ϲ���
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
		
		boolean boo = c1.addAll(c2);			//set���ϣ��ظ�Ԫ�ز������
		
		System.out.println(c1+":"+boo);
		
		boolean boo1 = c2.addAll(c1);			//List���ϣ��ظ�Ԫ�ؿ������
		
		System.out.println(c2+":"+boo1);
		
		
		Collection<String> c3 = new ArrayList<String>();
		
		c3.add("java");
		c3.add("C++");
		c3.add(".net");
		
		/*
		 * boolean containsAll (Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		
		boolean contains = c2.containsAll(c3);
		System.out.println("ȫ������"+contains+":"+c2);
		
		/*
		 * removeall
		 * ɾ��c2�����к�c3һ����Ԫ��
		 */
		
		boolean removeall = c2.removeAll(c3);
		
		System.out.println("�Ƴ���"+removeall+":"+c2);
	}

}
