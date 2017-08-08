package day03;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 对指定时间分量设置给定的值
 * @author tarena
 *
 */
public class Calendar_set extends DateDemo {

	public static void main(String[] args) {
			Calendar calendar = Calendar.getInstance();
				//设置年为2008
			calendar.set(Calendar.YEAR, 2008);
				//设置月为8月
			calendar.set(Calendar.MONTH, 8-1);
				//设置日为10
			calendar.set(Calendar.DAY_OF_MONTH, 10);
				//设置小时为：18
			calendar.set(Calendar.HOUR_OF_DAY, 18);
				//设置分为54
			calendar.set(Calendar.MINUTE, 54);
				//设置秒为25
			calendar.set(Calendar.SECOND, 25);
			
			System.out.println(calendar.getTime());
			
			calendar.set(Calendar.HOUR_OF_DAY,26);
			System.out.println(calendar.getTime());
	}

}
