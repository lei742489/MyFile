package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序含有自定义类型元素的List集合
 * @author tarena
 *
 */
public class SortListDemo2 {

	public static void main(String[] args) {

		List<Point> list = new ArrayList<Point>();
		
		 list.add(new Point(1,5));
		 list.add(new Point(7,4));
		 list.add(new Point(3,6));
		 list.add(new Point(7,9));
		 list.add(new Point(2,9));
		 list.add(new Point(9,5));
		 /*
		  * sort方法要求集合元素必须实现Comparble接口
		  * 否则无法排序
		  */
		 System.out.println(list);
		 
		 Collections.sort(list);
		 
		 System.out.println(list);
	}

}
