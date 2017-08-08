package day02;
/**
 * JAVA 1.5的时候推出了一个新的特性
 * 自动折装箱
 * 该 特性是编译器认可，而非虚拟机认可
 * 该特性的作用是翻译器会在编译源代码的时候将基本类型与包装类之间补充代码进行转换。这样就省去了程序员编写代码时在两者之间赋值时需要添加
 * 代码转换的麻烦了
 * @author tarena
 *
 */
public class IntegerDemo3 {

	public static void main(String[] args) {
		int i = new Integer(123);
		
		Integer in = i;
	}

}
