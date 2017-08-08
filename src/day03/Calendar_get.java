package day03;

import java.util.Calendar;

/**
 * Calendar提供了根据给定时间分量获取对应值的方法：
 * int get(int field)
 * 
 * 时间分量对应的是Calendar提供的相应常量。
 * 
 * @author tarena
 *
 */
public class Calendar_get {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();				//获取时区，时间
		int year = calendar.get(Calendar.YEAR);					//获取年
		
		int moth = calendar.get(Calendar.MONTH)+1;				//获取月,月从0开始计算
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);			//获取日
		
	
		/*
		 * 天有不同时间分量：
		 * DAY_OF_MONTH: 月中的天，即：几号
		 * DAY_OF_WEEK:	 周中的天，即：星期几。
		 * DAY_OF_YEAR:  年中的天。
		 * DATE:		与DAY_OF_MONTH意思一致。
		 */
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);				//获取小时（24小时）
		
		int m = calendar.get(Calendar.MINUTE);					//获取分
		
		int s = calendar.get(Calendar.SECOND);					//获取秒
		
		System.out.println(year+"-"+moth+"-"+day);
		System.out.println(h+":"+m+":"+s);
		
		//查看今天是今年的第几天。
		
		int days =calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第："+days+"天");
		
		//查看今天星期几？
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;			//获取星期几,星期从周日开始计算，所以-1
		
		char [] weeks = {'日','一','二','三','四','五','六'};			//用数组方式大写显示星期几
		
		System.out.println("今天是星期"+weeks[week]);					
				
		

	}

}
