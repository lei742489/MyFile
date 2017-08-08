package day09;
/**
 * 用匿名内部类完成线程的两种方式创建
 * 
 * @author tarena
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {

		//方式1
		new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊");
				}
			}
		}.start();
		
		//方式2
		new Thread(new Runnable(){
			public void run(){
				for (int i=0;i<1000;i++){
					System.out.println("查水表的！！");
				}
			}
		}).start();
		
	}

}
