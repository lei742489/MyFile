package day03;

import java.util.Date;

/**
 * java.Util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ʱ���
 * Date�ڲ�ά��һ��longֵ����ֵ��UtCʱ�䣬����
 * ��1970��1��1�� 00��00��00 ����Date��ʾ��ʱ��֮���������ĺ���
 * ����Date����ʱ����ǧ������⣬���Դ󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ(����ʱ�佻��Calendar�����)
 * @author tarena
 *
 */
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		Date now = new Date();
		
		System.out.println(now);
		long time = now.getTime();
		run();
		//�鿴25���Ժ������죿
		time += 25*1000*60*60*24L;
		now.setTime(time);
		System.out.println(now);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * ��ȡDate�ڲ�ά��longֵ����ֵ��ʾ
	 * ��1970��Ԫ������ǰDate��ʾ������֮���������ĺ���
	 */
	public static void run(){
		Date now = new Date();
		long time = now.getTime();
		System.out.println("�����ˣ�"+time/1000/60/60/24+'��');
	}
	
}
