package day02;

import java.util.Scanner;

/**
 * �ַ���֧��������ʽ�ķ���֮һ��
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * �����򷵻�true
 * ��Ҫע�⣬������������ʽ�����Ƿ���˱߽��(^..$)�����ǽ���ȫƥ����֤��
 * @author tarena
 *
 */
public class String_matches {
	/**
	 * �����������ʽ:
	 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+[\.a-zA-Z]+
	 * @param args
	 */
	public static void main(String[] args) {
		String Mail;
		
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-z]+)+";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�����������ַ��");
		Mail=sc.nextLine();
		System.out.println();
		boolean match = Mail.matches(regex);
		
		if(match){
			System.out.println(Mail+"������Ч����");
		}
		else{
			System.out.println(Mail+"��������Ч����");
		}
		sc.close();
	}

}
