package day02;
/**
 * ʵ��ͼƬ������
 * @author tarena
 *
 */
public class Test {

	public static void main(String[] args) {
		String imagename = "12345.jpg";
		String [] newname = imagename.split("\\.");				//��.���Ϊ��������
		imagename = System.currentTimeMillis()+"."+ newname[1];	//���ݵ�ǰʱ���������ļ�
		System.out.println(imagename);

	}

}
