package day04;
//泛型测试。。。
import java.util.Collection;

public class PostionTest {

	public static void main(String[] args) {
		
		Postition <Integer> c1 = new Postition<Integer>(1,2);
		c1.setY(50);
		int p1 = c1.getX();
		System.out.println(c1+"p1:"+p1);
		
		Postition<Double> c2 = new Postition<Double>(2.22, 5.35);
		c2.setX(50.3);
		System.out.println(c2);
		
		Postition<String> c3 = new Postition<String>("一", "三");
		c3.setY("二");
		System.out.println(c3);
	}

}
