package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ַ���
 * @author tarena
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("test.txt", "r");
		
		byte [] data = new byte[50];
		
		int len = raf.read(data);
		/*
		 * String(byte[] data)
		 * �������ֽ������������ֽڰ��յ�ǰϵͳĬ��
		 * �ַ���ת��Ϊ��Ӧԭ�ַ���
		 * 
		 * String(Byte[] data, int offset,int len)
		 * �������ֽ�������´�offset����ʼ������len���ֽڰ���
		 * ϵͳĬ���ַ���ת��Ϊ�ַ���
		 * 
		 * 
		 */
		String str =  new String(data,0,len,"utf-8");
		
		System.out.println(str);
		raf.close();
	}

}
