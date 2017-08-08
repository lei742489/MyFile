package day10;
/**
 * 
 * ���̲߳�����ȫ����
 * 
 * ������̲߳�������ͬһ��Դʱ�������߳��л�ʱ����ȷ��
 * ���´���δ������Ʒ�ʽ��˳��ִ�е��µ��߼����ҡ�����
 * ʱ���ܵ���ϵͳ̱��
 * @author tarena
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		
			Table table = new Table();
			
			Thread t1 = new Thread(){
				public void run(){
					while(true){
						int bean = table.getBean();
						Thread.yield();
						System.out.println(getName()+":"+bean);
					}
				}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}

class Table{
	private int beans = 20;
	/*
	 * ������̲߳�����ȫ���ֶ��ǽ������ɸ��ġ���Ϊ���Ŷ�ִ�С�
	 * ��һ�������� synchronized���κ���ô�� ����
	 * ��Ϊ��ͬ������������������̲߳���ͬʱ���뵽����
	 * �ڲ�ִ�С� 
	 * 
	 * �ڷ�����ʹ��sycnchronized���κ������Ķ������
	 * ��ǰ�����Ķ��󣬼��������п�����this
	 *
	 */
	public synchronized int getBean(){
		if(beans == 0){
			throw new RuntimeException("û�����ˡ�");
		}
		Thread.yield();
		return beans--;
	}
}