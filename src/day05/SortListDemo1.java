package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���򼯺�
 * ���򼯺Ͽ���ʹ�ü��ϵĹ�����java.util.Collections
 * ���ṩ�˷�����sort,���Զ�List���Ͻ�����Ȼ���򣨴�С����)
 * ��Ҫע��ֻ�ܶ�List����
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
