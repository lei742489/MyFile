package day03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入自己的生日，格式为：
 * yyyy-mm-dd;
 * 后计算输出到今天为止活了多少天。
 * @author tarena
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		System.out.println("请输入生日，格式为：yyyy-mm-dd");
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		do {
			if(!in.matches("\\d{4}-\\d{1,2}-\\d{2}")){
			System.out.println("生日格式不对");
			in = sc.nextLine();
			}
		}	while(!in.matches("\\d{4}-\\d{1,2}-\\d{2}"));
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		
		Date birth = sim.parse(in);
		Date now = new Date();
		long time = now.getTime()-birth.getTime();
		
		
		 time = time /1000/60/60/24;
		System.out.println("到今天为止你共活了："+time+"天");
		
		if(10000-time>0){
			long check = (10000-time)*1000*60*60*24L;
			long reachtime = now.getTime()+check;
			System.out.println("达成生存10000天成就的日期为："+sim.format(reachtime));
		}
	}

}
