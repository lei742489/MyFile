package day08;
/**
 * 
 * java�쳣��������е�try-catch
 * @author tarena
 *
 */
public class Exception_try_catch {

	public static void main(String[] args) {
		try{

			System.out.println("����ʼ��");

			String str  = null;
			int [] in ={1,2,3,4,5};
			System.out.println(str.length());		//try���г���������µ����ݶ���������
			System.out.println(in[5]);
		}catch(IndexOutOfBoundsException t){
			System.out.println("�������±�Խ�磡");
		}catch(NullPointerException n){
			System.out.println("�����˿�ָ�룡");
			/*
			 *  catch���Զ����������ݲ�ͬ�쳣�в�ͬ����취ʱ��Ӧ���ֱ𲶻���Щ�쳣
			 *  ��Ӧ������һ����ϰ�ߣ������catch�����쳣Exception,�������Ա�����
			 *  Ϊ�����׳�һ��δ֪���쳣���³����жϡ�
			 *  ��������쳣���ڼ̳й�ϵʱ��Ӧ���������쳣�������в��񣬸���������֮��
			 *	
			 */
			
		}catch(Exception e){						
			System.out.println("δ֪����");
		}

		System.out.println("���������");
	}

}
