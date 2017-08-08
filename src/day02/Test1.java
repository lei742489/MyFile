package day02;
/**
 * 网络用语和谐
 * @author tarena
 *
 */

public class Test1 {

	public static void main(String[] args) {
		String regex = "(tmd|wqnmlgb|sb|nc|cnm|djb)";
		String say = "你这个sb,nc!你怎么这么cnm,versbced";
		
		say = say.replaceAll(regex, "***");
		System.out.print(say);
	}

}
