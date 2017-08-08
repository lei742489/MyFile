package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取List子集
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
		
		
		 // 获取指定范围子集
		 

		System.out.println(sublist);
		
		//将子集所有元素扩大10倍
		for(int i=0;i<sublist.size();i++){
			
								
			sublist.set(i, sublist.get(i) * 10);
		}
		System.out.println(sublist);
		
		
		/*
		 * 将集合中2-8元素删除
		 */
		
		list.subList(2, 9).clear();
		System.out.println(list);
	}
		

}
