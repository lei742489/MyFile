package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入自己的生日，然后输出其生日当天是当年的第几天以及星期几？
 * @author tarena
 *
 */
public class Test2 {

	public static void main(String[] args) throws ParseException {
		System.out.println("请输入生日：（格式：yyyy-mm-dd");
		Scanner sc = new Scanner(System.in);
		String in  = sc.nextLine();
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = sim.parse(in);
	
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//System.out.println(date);
		
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		char [] weeks ={'日','一','二','三','四','五','六'};
		System.out.println("您生日那天是："+calendar.get(Calendar.YEAR)+"年的第"+days+"天，星期"+weeks[week]);
	}

}
