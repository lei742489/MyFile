package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转为集合
 * 数组转换为集合使用数组的工具类Arrays,其提供了一个静态方法asList
 * 需要注意，只能转换为List集合。
 * @author tarena
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {

		String [] array = {"one","two","three","four","five"};
		
		List <String> list = Arrays.asList(array);
		//对集合元素操作就是对原数组对应元素的操作
		//不可以直接添加元素，这会导致原数组扩容 ，而
		//如果扩容就不能表示原数组，所以这样的操作不受支持。
		System.out.println(list);
		list.set(3, "4");
		for(String str:array){
			System.out.println(str);
		}
		/*
		 * 如果需要添加元素，需要另行创建一个新集合
		 */
		List<String> list2 = new ArrayList<String>(list);	//集合可以直接传参
		
		System.out.println(list2);
		list2.add("45809");
		System.out.println(list2);
	}

}
