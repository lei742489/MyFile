package day10;
/**
 * 线程提供了一个方法：join
 * join可以协调线程间同步运行。
 * 
 * 
 */
public class Thread_join {
	private static boolean isFinish = false;
	public static void main(String[] args) {
		
		Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片....");
				for (int i=1;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("图片下载完毕！");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("开始显示图片..");
				
				try {
					/*
					 * 先等待下载线程将图片下载完毕
					 * 
					 * 当show线程调用download线程的join方法
					 * 时，show线程进入阻塞状态，直到download
					 * 执行完毕才会解除阻塞继续执行后续代码
					 */
					download.join();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片打开失败");
				}
				System.out.println("图片打开完毕");
			}
		};
		download.start();
		
		show.start();
	}

}
