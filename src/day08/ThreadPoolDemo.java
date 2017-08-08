package day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * 线程池
 * 线程池主要解决两个问题：
 * 1:控制线程数量。因为线程娄多了，会导致内存开销大，
 * 	 严重时会导致系统瘫痪，并且由于线程数量多会导致
 * 	cpu过度切换，拖慢系统响应。
 * 2：重用线程 
 *
 * @author tarena
 *
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable run= new Runnable() {
				
				@Override
				public void run() {
					Thread t = Thread.currentThread();
					System.out.println(t.getName()+":正在运行...");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						System.out.println("警告:线程被中断!!");
					}
					System.out.println(t.getName()+":运行任务结束！");
				}
			};
			threadPool.execute(run);
			System.out.println("指派一个任务给线程池");
			
		}
		//.shutdownNow可以马上结束线程,
		threadPool.shutdown();
		System.out.println("停止线程池");
	}

}
