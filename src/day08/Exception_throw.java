package day08;
/**
 * 
 * throw用于抛出一个异常
 * 通常两种情况会要求抛出一个异常：
 * 1：当前方法中出现了一个满足语法要求，但是不满足业务逻辑要求的情况时
 * 可以当做一个异常抛出给调用者，通知其这样的操作不允许。
 * 2：当前方法代码中确实出现了异常，但是该异常不应当同当前方法一解决时可以将其抛给调用者。
 * @author tarena
 *
 */
public class Exception_throw {

	public static void main(String[] args)  {

			Person p = new Person();
			/*
			 * 当调用的一个方法含有throws声明异常抛出时，
			 * 编译器会检查调用该方法的代码有没有处理该异常，
			 * 没有则编译不通过。
			 * 处理手段有两种：
			 * 1：通过try-catch捕获异常
			 * 2：在当前方法上继续使用throws声明该异常的抛出
			 */
			
				try {
					p.setAge(500);
				} catch (IllegalAgeException e) {
					
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			
				
			
			
	}

}
