package day03;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * ��ָ��ʱ��������ø�����ֵ
 * @author tarena
 *
 */
public class Calendar_set extends DateDemo {

	public static void main(String[] args) {
			Calendar calendar = Calendar.getInstance();
				//������Ϊ2008
			calendar.set(Calendar.YEAR, 2008);
				//������Ϊ8��
			calendar.set(Calendar.MONTH, 8-1);
				//������Ϊ10
			calendar.set(Calendar.DAY_OF_MONTH, 10);
				//����СʱΪ��18
			calendar.set(Calendar.HOUR_OF_DAY, 18);
				//���÷�Ϊ54
			calendar.set(Calendar.MINUTE, 54);
				//������Ϊ25
			calendar.set(Calendar.SECOND, 25);
			
			System.out.println(calendar.getTime());
			
			calendar.set(Calendar.HOUR_OF_DAY,26);
			System.out.println(calendar.getTime());
	}

}
