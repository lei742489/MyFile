package day09;
/**
 * ��ȡ�߳���Ϣ����ط�����
 * @author tarena
 *
 */
public class Thread_info {

	public static void main(String[] args) {

		Thread main = Thread.currentThread();
		//��ȡ�߳�Ψһ��ʶ
		long id = main.getId();
		System.out.println("��ʶ��"+id);
		//��ȡname
		String name = main.getName();
		System.out.println("Name��"+name);
		//��ȡ���ȼ�
		int priority = main.getPriority();
		System.out.println("���ȼ���"+priority);
		//�߳��Ƿ����
		boolean isAlive = main.isAlive();
		System.out.println("isAlive��"+isAlive);
		//�Ƿ�Ϊ�ػ��߳�
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon��"+isDaemon);
		//��ǰ�߳��Ƿ��ж�
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted��"+isInterrupted);
	}

}
