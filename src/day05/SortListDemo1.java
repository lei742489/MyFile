package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 排序集合
 * 排序集合可以使用集合的工具类java.util.Collections
 * 它提供了方法：sort,可以对List集合进行自然排序（从小到大)
 * 需要注意只能对List排序。
 * @author tarena
 *
 */
class SortListDemo1 {

	public static void main(String[] args) {
			
		List<Integer> list = new ArrayList<Integer>();
		
		Random rad = new Random();
		
		for (int i=0;i<10;i++){
			
			list.add(rad.nextInt(100));
		}
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
