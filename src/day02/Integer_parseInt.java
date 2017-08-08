package day02;
/**
 * 包装类有一个静态方法：parseXXX(String str)
 * 可以将给定的字符串转换为对应的基本类型值。但是前提是该字符串表示的内容是该基本类型可以保存的值.
 * @author tarena
 *
 */
public class Integer_parseInt {
		public static void main(String[] args) {
			String str = "9878";
			String str1 = "a";
			
			int i = Integer.parseInt(str);
			System.out.println(i);
			
			double d = Double.parseDouble(str);
			System.out.println(d);
			
			
		}	
}
