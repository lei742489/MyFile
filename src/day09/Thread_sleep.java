package day09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 线程提供了一个静态方法
 * static void sleep(long ms)
 * 该方法会将运行当前方法的线程阻塞指定毫秒。
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
