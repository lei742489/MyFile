package day05;
/**
 * �����ַ�������
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {

	public static void main(String[] args) {

		List <String> list = new ArrayList<String>();
		
		list.add("����ʦ");
		list.add("����");
		list.add("С����ʦ");
		
		System.out.println(list);
		//Collections.sort(list);
		/*
		 * Collections�ṩ��һ�����ص�sort����
		 * static void sort(List,Comparator)
		 * �÷���Ҫ�������һ���Ƚ�����Ȼ��ʹ������Ƚ���
		 * ����Ĺ���Ƚϼ���Ԫ�ز�������Ȼ����ʹ�ø÷���ʱ��
		 * sort��Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ�(��Ϊ����Ԫ������ıȽϹ���)
		 */
		Collections.sort(list,new Comparator<String>() {
			public int compare(String s1,String s2){
				
				return s1.length()-s2.length();
				
			}
		});
		System.out.println(list);
	}

}
