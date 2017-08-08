package day08;
/**
 * 
 * java异常处理机制中的try-catch
 * @author tarena
 *
 */
public class Exception_try_catch {

	public static void main(String[] args) {
		try{

			System.out.println("程序开始了");

			String str  = null;
			int [] in ={1,2,3,4,5};
			System.out.println(str.length());		//try块中出错代码以下的内容都不再运行
			System.out.println(in[5]);
		}catch(IndexOutOfBoundsException t){
			System.out.println("出现了下标越界！");
		}catch(NullPointerException n){
			System.out.println("出现了空指针！");
			/*
			 *  catch可以定义多个，根据不同异常有不同处理办法时，应当分别捕获这些异常
			 *  但应当养成一个好习惯，在最后catch最大的异常Exception,这样可以避免因
			 *  为代码抛出一个未知的异常导致程序中断。
			 *  当捕获的异常存在继承关系时，应当将子类异常在上先行捕获，父类在子类之下
			 *	
			 */
			
		}catch(Exception e){						
			System.out.println("未知错误！");
		}

		System.out.println("程序结束了");
	}

}
