package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * �ַ�����
 * 		�ַ������ֽ������������ڶ�д��λΪ���ַ�
 * 		�����ַ����ײ㱾�ʻ��Ƕ�д�ֽڣ�ֻ���ַ����ֽڵ�ת��
 * 		�����������ַ�������ɡ�
 * 
 * Reader�������ַ��������ĸ��࣬�涨�˶�ȡ�ַ�����ط���
 * Writer�������ַ�������ĸ��࣬�涨��д���ַ�����ط���
 * 
 * ת������
 * 		InputStreamReader,OutputStreamWriter
 * 		�������ַ�����һ�Գ�����ʵ���ࡣ
 * @author tarena
 *
 */
public class OutputStreamWriter_write {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("fos.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("�л����񹲺͹��Ĵ�ʡ�ɶ���");
		osw.write("\r\n��ɰ�н�����ʾ�°��]��");
		
		System.out.println("д���ɹ�!");
		osw.close();
	}

}
