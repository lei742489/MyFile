package day08;
/**
 * 
 * throw�����׳�һ���쳣
 * ͨ�����������Ҫ���׳�һ���쳣��
 * 1����ǰ�����г�����һ�������﷨Ҫ�󣬵��ǲ�����ҵ���߼�Ҫ������ʱ
 * ���Ե���һ���쳣�׳��������ߣ�֪ͨ�������Ĳ���������
 * 2����ǰ����������ȷʵ�������쳣�����Ǹ��쳣��Ӧ��ͬ��ǰ����һ���ʱ���Խ����׸������ߡ�
 * @author tarena
 *
 */
public class Exception_throw {

	public static void main(String[] args)  {

			Person p = new Person();
			/*
			 * �����õ�һ����������throws�����쳣�׳�ʱ��
			 * ������������ø÷����Ĵ�����û�д�����쳣��
			 * û������벻ͨ����
			 * �����ֶ������֣�
			 * 1��ͨ��try-catch�����쳣
			 * 2���ڵ�ǰ�����ϼ���ʹ��throws�������쳣���׳�
			 */
			
				try {
					p.setAge(500);
				} catch (IllegalAgeException e) {
					
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			
				
			
			
	}

}
