package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 该类可以按照给定的日期格式将Date与String之间互相转换。
 * @author tarena
 *
 */
public class SimpleDateFormat_format {
		/**
		 * 希望按照：
		 * 2017年7月25日 10:35:22
		 * yyyy年M月dd日 HH:mm:ss
		 * @param args
		 */
	
	
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy年M月dd日  HH:mm:ss");
		/**
		 * 按照SimpleDateFormat指定的日期格式将给定的Date转换为字符串
		 */
		String str = sim.format(now);
		
		System.out.println(str);
		
	}

}
