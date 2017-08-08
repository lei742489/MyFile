package day10;
/**
 * 
 * 守护线程
 * 守护线程也称为后台线程
 * 
 * 默认创建出来的线程都是前台线程，若要设置为后台线程
 * 可以通过线程提供的方法setDeamon来完成
 * 
 * 后台线程使用上与前台线程一样，但是在结束时机上有一点不同，
 * 即：当一个进程结束时，所有正在运行的后台线程都会强制结束。
 * 而进程的结束是当一个进程中所有前台线程都结束时结束。
 * 
 * 所以将来开发中可以将一直保持运行的任务，但是可以随着程序一同结束
 * 的放在后台线程上运行。
 * @author tarena
 *
 */
public class Thread_setDaemon {

	public static void main(String[] args) {

		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:Let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
				}
				System.out.println("啊啊啊啊啊啊啊啊啊啊~~");
				System.out.println("扑通！！");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("Jack:You jump,I jump!");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					}
				}
		};
		/*
		 * 守护线程必须在线程启动前设置
		 */
		jack.setDaemon(true);
		rose.start();
		jack.start();
	}

}
