package day09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * �߳��ṩ��һ����̬����
 * static void sleep(long ms)
 * �÷����Ὣ���е�ǰ�������߳�����ָ�����롣
 * @author tarena
 *
 */
public class Thread_sleep {

	public static void main(String[] args) {

		
		SimpleDateFormat sim = new SimpleDateFormat("HH:mm:ss");
		
		while(true){
			
			System.out.println(sim.format(new Date()));
			System.out.println();
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
