package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ����
 * �����������һ��Ԫ�أ������鹦������
 * �����ṩ�˲���Ԫ�ص���ط���
 * ���ϳ����������ӽӿڣ�
 * Set:�����ظ������ظ�Ԫ�ز��ܷ��뼯����������
 * List:���ظ���
 * Ԫ���Ƿ��ظ�������Ԫ������equals�ȽϵĽ������
 * @author tarena
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		
		/*
		 * boolean add(E e)
		 * ��ǰ��������Ӹ���Ԫ�أ����ɹ������򷵻�true��
		 * 
		 */
		c.add("1234");
		c.add("324234234");
		c.add(234432);
		c.add(55442.3654);
		System.out.println(c);
		
		/*
		 * int size()
		 * ���ص�ǰ���ϵ�Ԫ�ظ���
		 */
		
		int size = c.size();
		System.out.println("size:"+size);
		
		
		/*
		 * boolean isEmpty()
		 * sizeΪ0ʱ������ture;
		 */
		boolean em = c.isEmpty();
		System.out.println("�Ƿ�ռ�:"+em);
		
		
		
		/*
		 * void clear();
		 * �Ƴ����б��е�����Ԫ�ء�
		 */
		c.clear();
		System.out.println("���������");
		
		System.out.println("size:"+c.size());
		
		System.out.println("isEmpty:"+c.isEmpty());
		
	}

}
