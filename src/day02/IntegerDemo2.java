package day02;
/**
 * 数字类型的包装类有两个常量
 * MAX_VALUE,MIN_VALUE
 * 分别用来表示其表示的基本类型的取值范围
 * @author tarena
 *
 */
public class IntegerDemo2 {

	public static void main(String[] args) {

		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		double dmax = Double.MAX_VALUE; 
		System.out.println(dmax);
		
		double dmin = Double.MIN_VALUE;
		System.out.println(dmin);
	}

}
