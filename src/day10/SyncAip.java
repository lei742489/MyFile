package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * �����ϻ�Mapת��Ϊ�̰߳�ȫ��
 * @author tarena
 *
 */
public class SyncAip {

	public static void main(String[] args) {
		/*
		 * ArrayList,LinkedList�������̰߳�ȫ��
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * ��������List����ת��Ϊ�̰߳�ȫ��
		 */
		
		list = Collections.synchronizedList(list);
		
		System.out.println(list);
		/*
		 * ��������Set����ת��Ϊ�̰߳�ȫ��
		 */
		
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
		
		/*
		 * ��������Map����ת��Ϊ�̰߳�ȫ��
		 */
		Map<String ,String> map = new HashMap<String,String>();
		
		map = Collections.synchronizedMap(map);
		
		/*
		 * �̰߳�ȫ�ļ���Ҳ��������������ü��ϵĲ���
		 * ���⡣���ǵ�����Ҫ������Ĺ����в���ͨ��
		 * ���ϵķ�����ɾԪ�أ�������׳��쳣��������
		 *����̼߳��������Ĳ���ʱ����Ҫ����ά������
		 *�����뼯��Ԫ�ز�����Ļ����ϵ ��
		 */
	}

}
