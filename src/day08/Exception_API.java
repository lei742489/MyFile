package day08;
/**
 * 异常常用方法
 * 
 * @author tarena
 *
 */
public class Exception_API {

	public static void main(String[] args) {

		System.out.println("程序开始了。");
		
		try{
		String str ="abc";
		System.out.println(Integer.parseInt(str));
		
		}catch(Exception e){
			//输出错误堆栈信息
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("程序结束了。");
	}

}
