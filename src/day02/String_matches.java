package day02;

import java.util.Scanner;

/**
 * 字符串支持正则表达式的方法之一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求
 * 满足则返回true
 * 需要注意，给定的正则表达式无论是否加了边界符(^..$)，都是进行全匹配验证。
 * @author tarena
 *
 */
public class String_matches {
	/**
	 * 邮箱的正则表达式:
	 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+[\.a-zA-Z]+
	 * @param args
	 */
	public static void main(String[] args) {
		String Mail;
		
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-z]+)+";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入邮箱地址：");
		Mail=sc.nextLine();
		System.out.println();
		boolean match = Mail.matches(regex);
		
		if(match){
			System.out.println(Mail+"，是有效邮箱");
		}
		else{
			System.out.println(Mail+"，不是有效邮箱");
		}
		sc.close();
	}

}
