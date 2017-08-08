package day10;
/**
 * 
 * 多线程并发安全问题
 * 
 * 当多个线程并发访问同一资源时，由于线程切换时机不确定
 * 导致代码未按照设计方式的顺序执行导致的逻辑混乱。严重
 * 时可能导致系统瘫痪
 * @author tarena
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		
			Table table = new Table();
			
			Thread t1 = new Thread(){
				public void run(){
					while(true){
						int bean = table.getBean();
						Thread.yield();
						System.out.println(getName()+":"+bean);
					}
				}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}

class Table{
	private int beans = 20;
	/*
	 * 解决多线程并发安全的手段是将“各干各的”变为“排队执行”
	 * 当一个方法被 synchronized修饰后，那么该 方法
	 * 称为“同步方法”，即：多个线程不能同时进入到方法
	 * 内部执行。 
	 * 
	 * 在方法上使用sycnchronized修饰后，上锁的对象就是
	 * 当前方法的对象，即：方法中看到的this
	 *
	 */
	public synchronized int getBean(){
		if(beans == 0){
			throw new RuntimeException("没豆子了。");
		}
		Thread.yield();
		return beans--;
	}
}