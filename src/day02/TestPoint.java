package day02;
/**
 * ��������Point��дObject����ط���
 * @author tarena
 *
 */
public class TestPoint {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.setX(2);
		p.setY(3);
		//String str = p.toString();			//Object������toString�������÷������ص�ǰ����ľ��
		
		//
		System.out.println(p);				//�÷��������������toString���ص��ַ���������̨
		
		Point p2 = new Point();
		p2.setX(2);
		p2.setY(3);
		
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
	}

}
