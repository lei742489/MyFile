package day08;
/**
 * �쳣���÷���
 * 
 * @author tarena
 *
 */
public class Exception_API {

	public static void main(String[] args) {

		System.out.println("����ʼ�ˡ�");
		
		try{
		String str ="abc";
		System.out.println(Integer.parseInt(str));
		
		}catch(Exception e){
			//��������ջ��Ϣ
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("��������ˡ�");
	}

}
