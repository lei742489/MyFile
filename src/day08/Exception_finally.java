package day08;
/**
 * 
 * finally��
 * finally��ֻ�ܶ������쳣������Ƶ����һ��
 * finally��ȷ������try���еĴ����Ƿ��׳��쳣��finally���еĴ��붼�ᱻִ��
 * 
 * ����finally���еĴ���ͨ�������޹غ������Ƿ񱨴�Ҫ
 * ���еĴ��롣������IO�У��ر����Ĳ�����Ӧ������finally����ȷ��ִ�С�
 * @author tarena
 *
 */
public class Exception_finally {

	public static void main(String[] args) {
		try{
			
			System.out.println("����ʼ");
			String str = null;
			System.out.println(str.length());
			System.out.println("���������С�����");
		}catch(Exception e){
			System.out.println("�������");
		}finally{
			System.out.println("finally����Ĵ���ʼ�ջ����У�");
			}
		
		System.out.println("�������");
		}
	}
