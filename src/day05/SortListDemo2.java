package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �������Զ�������Ԫ�ص�List����
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
		  * sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparble�ӿ�
		  * �����޷�����
		  */
		 System.out.println(list);
		 
		 Collections.sort(list);
		 
		 System.out.println(list);
	}

}
