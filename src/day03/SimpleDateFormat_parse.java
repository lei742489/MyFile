package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��һ���ַ�������ΪDate:
 * @author tarena
 *
 */
public class SimpleDateFormat_parse {

	public static void main(String[] args) throws ParseException {
			String str = "2017-05-22 10:55:21";
			
			SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			/**
			 * ���������ַ�������SimpleDateFormatָ����
			 * ���ڸ�ʽ����Ϊһ��Date����
			 */
			Date date = sim.parse(str);
			
			System.out.println(date);
	}

}
