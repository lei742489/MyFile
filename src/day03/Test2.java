package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Ҫ���û������Լ������գ�Ȼ����������յ����ǵ���ĵڼ����Լ����ڼ���
 * @author tarena
 *
 */
public class Test2 {

	public static void main(String[] args) throws ParseException {
		System.out.println("���������գ�����ʽ��yyyy-mm-dd");
		Scanner sc = new Scanner(System.in);
		String in  = sc.nextLine();
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = sim.parse(in);
	
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//System.out.println(date);
		
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		char [] weeks ={'��','һ','��','��','��','��','��'};
		System.out.println("�����������ǣ�"+calendar.get(Calendar.YEAR)+"��ĵ�"+days+"�죬����"+weeks[week]);
	}

}
