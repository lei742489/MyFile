package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * �����࣬��һ�������࣬��������س����Լ�������ز���
 * ���ڵķ�����
 * ����ʵ���ࣺGregorianCalendar ��������
 * 
 * Calendar�ṩ��һ����̬������getInstance,�÷������Ը��ݵ�ǰϵͳ���ڵ�����ȡһ�����õ�ʵ���ࡣ
 * @author tarena
 *
 */
public class Calendar_getInstance {
		/**
		 * Ĭ�ϴ�������Ҳ��ʾ��ǰϵͳʱ��
		 * @param args
		 */
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		/**
		 * ��Calendar��ʾ��������Date��ʽ��ʾ
		 * Calendar�ṩ�˷�����
		 * Date getTime();
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * ʹ��ǰCalendar��ʾ������Date����ʾ�����ڡ� 
		 */
		
		calendar.setTime(date);
		//System.out.println(calendar);
	}

}
