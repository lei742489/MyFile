package day10;
/**
 * ������
 * @author tarena
 *
 */
public class SyncDemo4 {

	public static void main(String[] args) {

		Foo foo = new Foo();
		
		Thread t1 = new Thread(){
			public void run(){
				foo.methodA();
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo{
	public synchronized void methodA(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":��������A����");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":����A�������");
	}
	
	public synchronized void methodB(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":��������B����");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":����B�������");
	}

}
