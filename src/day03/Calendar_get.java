package day03;

import java.util.Calendar;

/**
 * Calendar�ṩ�˸��ݸ���ʱ�������ȡ��Ӧֵ�ķ�����
 * int get(int field)
 * 
 * ʱ�������Ӧ����Calendar�ṩ����Ӧ������
 * 
 * @author tarena
 *
 */
public class Calendar_get {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();				//��ȡʱ����ʱ��
		int year = calendar.get(Calendar.YEAR);					//��ȡ��
		
		int moth = calendar.get(Calendar.MONTH)+1;				//��ȡ��,�´�0��ʼ����
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);			//��ȡ��
		
	
		/*
		 * ���в�ͬʱ�������
		 * DAY_OF_MONTH: ���е��죬��������
		 * DAY_OF_WEEK:	 ���е��죬�������ڼ���
		 * DAY_OF_YEAR:  ���е��졣
		 * DATE:		��DAY_OF_MONTH��˼һ�¡�
		 */
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);				//��ȡСʱ��24Сʱ��
		
		int m = calendar.get(Calendar.MINUTE);					//��ȡ��
		
		int s = calendar.get(Calendar.SECOND);					//��ȡ��
		
		System.out.println(year+"-"+moth+"-"+day);
		System.out.println(h+":"+m+":"+s);
		
		//�鿴�����ǽ���ĵڼ��졣
		
		int days =calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵڣ�"+days+"��");
		
		//�鿴�������ڼ���
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;			//��ȡ���ڼ�,���ڴ����տ�ʼ���㣬����-1
		
		char [] weeks = {'��','һ','��','��','��','��','��'};			//�����鷽ʽ��д��ʾ���ڼ�
		
		System.out.println("����������"+weeks[week]);					
				
		

	}

}
