package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ������԰��ո��������ڸ�ʽ��Date��String֮�以��ת����
 * @author tarena
 *
 */
public class SimpleDateFormat_format {
		/**
		 * ϣ�����գ�
		 * 2017��7��25�� 10:35:22
		 * yyyy��M��dd�� HH:mm:ss
		 * @param args
		 */
	
	
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy��M��dd��  HH:mm:ss");
		/**
		 * ����SimpleDateFormatָ�������ڸ�ʽ��������Dateת��Ϊ�ַ���
		 */
		String str = sim.format(now);
		
		System.out.println(str);
		
	}

}
