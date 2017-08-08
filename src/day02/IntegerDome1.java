package day02;
/**
 * 包装类
 * java为8个基本类型分别定义了8个包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题
 * @author tarena
 *
 */
public class IntegerDome1 {
			//基本类型转换为包装类：
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(12);		
		Integer i2 = Integer.valueOf(12);
		int i5 =5;
		System.out.println(i1==i2);		
		System.out.println(i1.equals(i2));
		
		Double i3 = Double.valueOf(1.2);
		Double i4 = Double.valueOf(1.2);
		
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println(i4+i5);
		
		//直接转换
		double d =i1.doubleValue();
		System.out.println(d);
		
		float f =i1.floatValue();
		System.out.println(f);
		
		int i = i3.intValue();
		System.out.println(i);
	}
	
	
}
