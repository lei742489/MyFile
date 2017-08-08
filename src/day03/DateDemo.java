package day03;

import java.util.Date;

/**
 * java.Util.Date
 * Date的每一个实例用于表示一个时间点
 * Date内部维护一个long值，该值是UtC时间，即：
 * 从1970年1月1日 00：00：00 到该Date表示的时间之间所经过的毫秒
 * 由于Date存在时区及千年虫问题，所以大部分操作时间的方法都被声明为过时(操作时间交给Calendar类完成)
 * @author tarena
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		Date now = new Date();
		
		System.out.println(now);
		long time = now.getTime();
		run();
		//查看25天以后是哪天？
		time += 25*1000*60*60*24L;
		now.setTime(time);
		System.out.println(now);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 获取Date内部维护long值，该值表示
	 * 自1970年元旦到当前Date表示的日期之间所经过的毫秒
	 */
	public static void run(){
		Date now = new Date();
		long time = now.getTime();
		System.out.println("经过了："+time/1000/60/60/24+'天');
	}
	
}
