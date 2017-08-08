package day03;

import java.util.Calendar;

/**
 * void add(int field, int value)
 * ��ָ��ʱ��������ϸ�����ֵ ����������ֵ�Ǹ������Ǽ�ȥ
 * @author tarena
 *
 */
public class Calendar_add {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��5��
		calendar.add(Calendar.YEAR, 5);
		//��2��
		calendar.add(Calendar.MONTH, 2);
		//��10��
		calendar.add(Calendar.DAY_OF_YEAR, 10);
		
		System.out.println(calendar.getTime());
		//��1��
		calendar.add(Calendar.YEAR, -1);
		System.out.println(calendar.getTime());
		
		/*
		 * �鿴�ĸ��µ��µ��Ǽ��ţ�
		 * int gaeActualMaximum(int field)
		 * ���ظ���ʱ���������������ֵ
		 * ��������Ϊ��ǰCalendar����ʾ������
		 */
		int days =calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("������У�"+days+"��");
		
		int years = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("�����У�"+years+"��");
	}

}
