package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������Ԫ��
 * 
 * Collection �ṩ�����ڱ�������Ԫ�صķ�����
 * Iterator iterator()
 * �÷�������һ���������ڱ�����ǰ���ϵĵ�����
 * 
 * java.util.Iterator
 * 
 * ��������������һ���ӿڣ��涨�����е������������ϵ�ͳһ��������ͬ�ļ���ʵ���඼�ṩ��һ����������ʵ����
 * ���ڱ����������������ע��������������֣�ֻҪ����������Iteratorʹ�ü��ɡ�
 * 
 * ʹ�õ���������������ѭ���ʣ�ȡ��ɾ�Ĳ��裬����ɾ��Ԫ�ز������Ǳ���ġ�
 * @author tarena
 *
 */
public class Collection_iterator {

	public static void main(String[] args) {
			Collection c =new ArrayList();
			
			c.add("one");
			c.add("#");
			c.add("two");
			c.add("#");
			c.add("three");
			c.add("#");
			c.add("four");
			c.add("#");
			c.add("five");
			
			
			/*
			 * boolean hasNext()
			 * ͨ���������жϼ����Ƿ���Ԫ�ؿ��Ա���
			 */
			Iterator it = c.iterator();
		/*	int index =0;
			String [] strs ={};
			while(it.hasNext()){
				strs = Arrays.copyOf(strs, strs.length+1);
				strs[index] = (String) it.next();
				index++;
				
			}*/
			
			/*
			 * ʹ�õ������������Ϲ����в���ͨ�����ϵķ�����ɾԪ�أ�������������´α���Ԫ��ʱ���׳��쳣������ͨ������
			 * ���ṩ��remove����ɾ��ͨ��newxt��ȡ��Ԫ��
			 * 
			 */
			
			while(it.hasNext()){
				String str = (String)it.next();
				
				//System.out.println(str);
				//ͨ����������remove����ɾ��#
				
				if("#".equals(str)){
					it.remove();
					}
				System.out.println(c);
			}
			
	}

}
