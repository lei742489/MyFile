package day04;
/**
 * ������1.5�Ƴ���������
 * ����Ҳ�Ǳ������Ͽ� �����������
 * ���͵�ԭ�;���Object.
 * ����ֻ�Ǳ������ڱ���Դ����ʱ����������Щ���飺
 * 1:���ʵ���Ƿ��뷺������һ��
 * 2����ȡ��������ʱ������������ת��
 * @author tarena
 *
 */
public class TestPosition2 {

	public static void main(String[] args) {
			Postition<Integer> p1 = new Postition<Integer>(3, 8);
			p1.setX(5);
			int x1 = p1.getX();
			System.out.println("x:"+ x1);
			
			Postition p2 =p1;
			
			p2.setX("��");
			
			System.out.println("x2��"+p2.getX());
			x1 = p1.getX();			//�������쳣 
			System.out.println("x:"+p1.getX());
	}

}
