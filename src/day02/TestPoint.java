package day02;
/**
 * 用来测试Point重写Object的相关方法
 * @author tarena
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.setX(2);
		p.setY(3);
		//String str = p.toString();			//Object定义了toString方法，该方法返回当前对象的句柄
		
		//
		System.out.println(p);				//该方法输出给定对象toString返回的字符串到控制台
		
		Point p2 = new Point();
		p2.setX(2);
		p2.setY(3);
		
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
	}

}
