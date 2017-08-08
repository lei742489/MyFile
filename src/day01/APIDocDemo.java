package day01;
/**
 * 文档注释只能修饰三个地方
 * 类，方法，常量
 * 文档注释可以被javadoc翻译并生成为手册。
 * 文档注释是功能级注释，用来说明整体功能。
 * @author Lei
 * @version 1.0
 * @see java.lang.String
 * @since JDK 1.0
 */
public class APIDocDemo {
	/**
	 * 指定信息。。
	 */
	public static final String INFO = "你好!";
	
	/**
	 * 当前方法是为指定用户添加一个访问语	
	 * @param name 指定的用户的名字
	 * @return 包含问候语的字符串
	 */
	
	public String sayHello(String name){
		return "你好"+name;
	}

}
