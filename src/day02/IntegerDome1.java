package day02;
/**
 * ��װ��
 * javaΪ8���������ͷֱ�����8����װ��
 * ��װ����Ϊ�˽���������Ͳ���ֱ�Ӳ���������󿪷�������
 * @author tarena
 *
 */
public class IntegerDome1 {
			//��������ת��Ϊ��װ�ࣺ
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(12);		
		Integer i2 = Integer.valueOf(12);
		int i5 =5;
		System.out.println(i1==i2);		
		System.out.println(i1.equals(i2));
		
		Double i3 = Double.valueOf(1.2);
		Double i4 = Double.valueOf(1.2);
		
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println(i4+i5);
		
		//ֱ��ת��
		double d =i1.doubleValue();
		System.out.println(d);
		
		float f =i1.floatValue();
		System.out.println(f);
		
		int i = i3.intValue();
		System.out.println(i);
	}
	
	
}
