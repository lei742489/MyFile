package day09;
/**
 * �������ڲ�������̵߳����ַ�ʽ����
 * 
 * @author tarena
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {

		//��ʽ1
		new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��");
				}
			}
		}.start();
		
		//��ʽ2
		new Thread(new Runnable(){
			public void run(){
				for (int i=0;i<1000;i++){
					System.out.println("��ˮ��ģ���");
				}
			}
		}).start();
		
	}

}
