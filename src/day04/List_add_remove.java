package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List֧�����±����Ԫ�ط�������
 * 
 * @author tarena
 *
 */
public class List_add_remove {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
	
		/*
		 * void add(int index,E e)
		 * ������Ԫ�ز���ָ��λ��
		 * 
		 */
		
		list.add(2,"3");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * ������λ�õ�Ԫ�شӼ�����ɾ����������Ԫ�ط��ء�
		 */
		String old = list.remove(2);
		System.out.println(list);
		System.out.println(old);
	}

}
