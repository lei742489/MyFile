package day03;

import java.util.Calendar;

/**
 * void add(int field, int value)
 * 对指定时间分量加上给定的值 ，若给定的值是负数刚是减去
 * @author tarena
 *
 */
public class Calendar_add {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//加5年
		calendar.add(Calendar.YEAR, 5);
		//加2月
		calendar.add(Calendar.MONTH, 2);
		//加10日
		calendar.add(Calendar.DAY_OF_YEAR, 10);
		
		System.out.println(calendar.getTime());
		//减1年
		calendar.add(Calendar.YEAR, -1);
		System.out.println(calendar.getTime());
		
		/*
		 * 查看哪个月的月底是几号？
		 * int gaeActualMaximum(int field)
		 * 返回给定时间分量所允许的最大值
		 * 参照日期为当前Calendar所表示的日期
		 */
		int days =calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("这个月有："+days+"天");
		
		int years = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年有："+years+"天");
	}

}
