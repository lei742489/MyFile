package day10;

import java.security.GeneralSecurityException;

/**+
 * ��̬����ʹ��synchronized,��ôһ������ͬ��Ч��
 * @author tarena
 *
 *��̬���������Ķ����Ǹ÷���������������
 *ʵ����JVM�ڼ���һ�����class�ļ�ʱ����ʵ����һ��Class
 *���͵�ʵ��ȥ����������Ϣ(���ԣ�������)������JVM��ÿ������
 *�����඼����ֻ��һ��Classʵ�����ڱ�ʾ�����Class��ʵ��
 *���Ǹ���������
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
		System.out.println(t.getName()+":��������dosom����");
		
		try {
			Thread.sleep(3000);
			System.out.println(t.getName()+":����dosome����");
		} catch (InterruptedException e) {
		}
		
	}
}
