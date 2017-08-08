package day10;

import java.security.GeneralSecurityException;

/**+
 * 静态方法使用synchronized,那么一定具有同步效果
 * @author tarena
 *
 *静态方法上锁的对象是该方法所属类的类对象
 *实际上JVM在加载一个类的class文件时，会实例化一个Class
 *类型的实例去保存该类的信息(属性，方法等)。所以JVM中每个加载
 *过的类都有且只有一个Class实例用于表示它这个Class的实例
 *就是该类的类对象
 */
public class SyncDemo3 {

	public static void main(String[] args) {
			Thread t1 = new Thread(){
				public void run(){
					boo.dosome();
				}
			};
			
			Thread t2 = new Thread(){
				public void run(){
					boo.dosome();
				}
			};
			
			t1.start();
			t2.start();
		
	}

}
class boo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在运行dosom方法");
		
		try {
			Thread.sleep(3000);
			System.out.println(t.getName()+":运行dosome方法");
		} catch (InterruptedException e) {
		}
		
	}
}
