package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡList�Ӽ�
 * @author tarena
 *
 */
public class List_subList {

	public static void main(String[] args) {
			
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> sublist = list.subList(3, 8);
		
		
		 // ��ȡָ����Χ�Ӽ�
		 

		System.out.println(sublist);
		
		//���Ӽ�����Ԫ������10��
		for(int i=0;i<sublist.size();i++){
			
								
			sublist.set(i, sublist.get(i) * 10);
		}
		System.out.println(sublist);
		
		
		/*
		 * ��������2-8Ԫ��ɾ��
		 */
		
		list.subList(2, 9).clear();
		System.out.println(list);
	}
		

}
