package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ��ǿforѭ�����ֳ�Ϊ����ѭ��, for each
 * ��ѭ������jdk1.5�Ժ��Ƴ���һ��������
 * ��ѭ��ֻ�����������ϻ�����ʹ��.
 * @author tarena
 *
 */
public class NewFor_Demo1 {

	public static void main(String[] args) {
		
		String[] array = {"one","two","three","four","five"};
		
		//��������
		for(String str1:array){
			System.out.println(str1);
		}
		
		//��������
		Collection<String> c = new ArrayList<String>();
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
		 * ��ѭ���������﷨�����Ǳ������Ͽɶ���������Ͽɵġ�
		 * �����������Դ����ʱ����ʹ����ѭ����������ʱ������ı�Ϊʹ�õ�����������
		 * ����Ҫע�⣬ʹ����ѭ����������ʱ��Ҫʹ�ü��ϵķ����޸�Ԫ�ء�
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
		}
		
		
	}

}
