package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * List集合是可重复集，且有序
 * 提供了一套可以通过下标操作元素的方法
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
		 * 获取给定下标处对应的元素。
		 */
		
		//获取第二个元素
		
		String str = list.get(1);
		System.out.println(str);
		
		//for循环遍历
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		/*
		 * E set(int i, E e)
		 * 替换元素操作
		 * 将给定元素设置到指定位置，返回值为原位置对应的元素
		 */
		
		String old = list.set(2, "三");
		
		System.out.println(list);
		
		System.out.println(old);			//old为替换前的元素
	}

}
