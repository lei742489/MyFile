package day10;
/**
 * 
 * �ػ��߳�
 * �ػ��߳�Ҳ��Ϊ��̨�߳�
 * 
 * Ĭ�ϴ����������̶߳���ǰ̨�̣߳���Ҫ����Ϊ��̨�߳�
 * ����ͨ���߳��ṩ�ķ���setDeamon�����
 * 
 * ��̨�߳�ʹ������ǰ̨�߳�һ���������ڽ���ʱ������һ�㲻ͬ��
 * ������һ�����̽���ʱ�������������еĺ�̨�̶߳���ǿ�ƽ�����
 * �����̵Ľ����ǵ�һ������������ǰ̨�̶߳�����ʱ������
 * 
 * ���Խ��������п��Խ�һֱ�������е����񣬵��ǿ������ų���һͬ����
 * �ķ��ں�̨�߳������С�
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
				System.out.println("��������������������~~");
				System.out.println("��ͨ����");
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
		 * �ػ��̱߳������߳�����ǰ����
		 */
		jack.setDaemon(true);
		rose.start();
		jack.start();
	}

}
