package day09;
/**
 * 
 * �߳��ṩ��һ����̬������
 * static THread currentThread()
 * �÷������Ի�ȡ��������������߳�
 * 
 * java�����д��붼�ǿ��߳����еģ�main����Ҳ�����⡣
 * ֻ��������main�������̲߳������Ǵ�����
 * @author tarena
 *
 */
public class Thread_currentThread {

	public static void main(String[] args) {
		
		Thread main =Thread.currentThread();
		
		System.out.println("����main���߳��ǣ�"+main);
		
		dosome();
		
		Thread t = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("�Զ����߳�:"+t);
			}
		};
		t.start();
	}
	public static void dosome(){
		Thread t = Thread.currentThread();
		System.out.println("����dosome���߳��ǣ�"+t);
	}

}
