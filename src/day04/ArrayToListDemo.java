package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����תΪ����
 * ����ת��Ϊ����ʹ������Ĺ�����Arrays,���ṩ��һ����̬����asList
 * ��Ҫע�⣬ֻ��ת��ΪList���ϡ�
 * @author tarena
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {

		String [] array = {"one","two","three","four","five"};
		
		List <String> list = Arrays.asList(array);
		//�Լ���Ԫ�ز������Ƕ�ԭ�����ӦԪ�صĲ���
		//������ֱ�����Ԫ�أ���ᵼ��ԭ�������� ����
		//������ݾͲ��ܱ�ʾԭ���飬���������Ĳ�������֧�֡�
		System.out.println(list);
		list.set(3, "4");
		for(String str:array){
			System.out.println(str);
		}
		/*
		 * �����Ҫ���Ԫ�أ���Ҫ���д���һ���¼���
		 */
		List<String> list2 = new ArrayList<String>(list);	//���Ͽ���ֱ�Ӵ���
		
		System.out.println(list2);
		list2.add("45809");
		System.out.println(list2);
	}

}
