package day05;
/**
 * 集合字符串排序
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {

	public static void main(String[] args) {

		List <String> list = new ArrayList<String>();
		
		list.add("苍老师");
		list.add("传奇");
		list.add("小泽老师");
		
		System.out.println(list);
		//Collections.sort(list);
		/*
		 * Collections提供了一个重载的sort方法
		 * static void sort(List,Comparator)
		 * 该方法要求额外入一个比较器，然后使用这个比较器
		 * 定义的规则比较集合元素并进行自然排序，使用该方法时，
		 * sort不要求集合元素必须实现Comparable接口(因为不用元素自身的比较规则)
		 */
		Collections.sort(list,new Comparator<String>() {
			public int compare(String s1,String s2){
				
				return s1.length()-s2.length();
				
			}
		});
		System.out.println(list);
	}

}
