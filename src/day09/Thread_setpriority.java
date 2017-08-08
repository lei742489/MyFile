package day09;
/**
 * 线程优先级
 * 对于纯种调度的工作，线程不能干涉，即：线程只能被动
 * 的等待分配cpu时间片，而不能主动获取。
 * 可以通过修改线程优先级来最大程度改善获取cpu时间片
 * 的几率，理论上，纯种优先级越高的线程获取cpu时间片
 * 的资料越多。
 * 线程的优先级有10个等级，分别用整数1-10表示。
 * 其中1最低，10最高，5为默认
 * 
 * @author tarena
 *
 */
public class Thread_setpriority {

	public static void main(String[] args) {
		
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
					
			}
		};
		
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
				System.out.println("min");
				}
			}
		};
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(10);
		
		min.start();
		max.start();
		nor.start();
		
		
	}

}
