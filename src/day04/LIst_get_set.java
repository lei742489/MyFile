package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List�����ǿ��ظ�����������
 * �ṩ��һ�׿���ͨ���±����Ԫ�صķ���
 * @author tarena
 *
 */
public class LIst_get_set {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * E get(int index)
		 * ��ȡ�����±괦��Ӧ��Ԫ�ء�
		 */
		
		//��ȡ�ڶ���Ԫ��
		
		String str = list.get(1);
		System.out.println(str);
		
		//forѭ������
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		/*
		 * E set(int i, E e)
		 * �滻Ԫ�ز���
		 * ������Ԫ�����õ�ָ��λ�ã�����ֵΪԭλ�ö�Ӧ��Ԫ��
		 */
		
		String old = list.set(2, "��");
		
		System.out.println(list);
		
		System.out.println(old);			//oldΪ�滻ǰ��Ԫ��
	}

}
