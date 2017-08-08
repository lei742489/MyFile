package day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * �̳߳�
 * �̳߳���Ҫ����������⣺
 * 1:�����߳���������Ϊ�߳�¦���ˣ��ᵼ���ڴ濪����
 * 	 ����ʱ�ᵼ��ϵͳ̱�������������߳�������ᵼ��
 * 	cpu�����л�������ϵͳ��Ӧ��
 * 2�������߳� 
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
					System.out.println(t.getName()+":��������...");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						System.out.println("����:�̱߳��ж�!!");
					}
					System.out.println(t.getName()+":�������������");
				}
			};
			threadPool.execute(run);
			System.out.println("ָ��һ��������̳߳�");
			
		}
		//.shutdownNow�������Ͻ����߳�,
		threadPool.shutdown();
		System.out.println("ֹͣ�̳߳�");
	}

}
