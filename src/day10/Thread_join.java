package day10;
/**
 * �߳��ṩ��һ��������join
 * join����Э���̼߳�ͬ�����С�
 * 
 * 
 */
public class Thread_join {
	private static boolean isFinish = false;
	public static void main(String[] args) {
		
		Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ....");
				for (int i=1;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("ͼƬ������ϣ�");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("��ʼ��ʾͼƬ..");
				
				try {
					/*
					 * �ȵȴ������߳̽�ͼƬ�������
					 * 
					 * ��show�̵߳���download�̵߳�join����
					 * ʱ��show�߳̽�������״̬��ֱ��download
					 * ִ����ϲŻ�����������ִ�к�������
					 */
					download.join();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬ��ʧ��");
				}
				System.out.println("ͼƬ�����");
			}
		};
		download.start();
		
		show.start();
	}

}
