package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date:
 * @author tarena
 *
 */
public class SimpleDateFormat_parse {

	public static void main(String[] args) throws ParseException {
			String str = "2017-05-22 10:55:21";
			
			SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			/**
			 * 将给定的字符串按照SimpleDateFormat指定的
			 * 日期格式解析为一个Date对象
			 */
			Date date = sim.parse(str);
			
			System.out.println(date);
	}

}
