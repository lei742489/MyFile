package day09;
/**
 * �߳����ȼ�
 * ���ڴ��ֵ��ȵĹ������̲߳��ܸ��棬�����߳�ֻ�ܱ���
 * �ĵȴ�����cpuʱ��Ƭ��������������ȡ��
 * ����ͨ���޸��߳����ȼ������̶ȸ��ƻ�ȡcpuʱ��Ƭ
 * �ļ��ʣ������ϣ��������ȼ�Խ�ߵ��̻߳�ȡcpuʱ��Ƭ
 * ������Խ�ࡣ
 * �̵߳����ȼ���10���ȼ����ֱ�������1-10��ʾ��
 * ����1��ͣ�10��ߣ�5ΪĬ��
 * 
 * @author tarena
 *
 */
public class Thread_setpriority {

	public static void main(String[] args) {
		
		Thread max = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("max");
				}
			}
		};
		
		Thread nor = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					System.out.println("nor");
				}
					
			}
		};
		
		Thread min = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
				System.out.println("min");
				}
			}
		};
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(10);
		
		min.start();
		max.start();
		nor.start();
		
		
	}

}
