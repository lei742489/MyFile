package day04;
/**
 * 泛型是1.5推出的新特性
 * 泛型也是编译器认可 ，而非虚拟机
 * 泛型的原型就是Object.
 * 泛型只是编译器在编译源代码时帮我们做了些事情：
 * 1:检查实参是否与泛型类型一致
 * 2：获取泛型数据时帮助进行类型转换
 * @author tarena
 *
 */
public class TestPosition2 {

	public static void main(String[] args) {
			Postition<Integer> p1 = new Postition<Integer>(3, 8);
			p1.setX(5);
			int x1 = p1.getX();
			System.out.println("x:"+ x1);
			
			Postition p2 =p1;
			
			p2.setX("二");
			
			System.out.println("x2："+p2.getX());
			x1 = p1.getX();			//类造型异常 
			System.out.println("x:"+p1.getX());
	}

}
