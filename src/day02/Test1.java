package day02;
/**
 * ���������г
 * @author tarena
 *
 */

public class Test1 {

	public static void main(String[] args) {
		String regex = "(tmd|wqnmlgb|sb|nc|cnm|djb)";
		String say = "�����sb,nc!����ô��ôcnm,versbced";
		
		say = say.replaceAll(regex, "***");
		System.out.print(say);
	}

}
