package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д�ַ���
 * @author tarena
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
		
		String str ="�л����񹲺͹�";
		/*
		 * byte[] getBytes(String csn)
		 * ����ǰ�ַ������ո����ַ���ת��Ϊһ���Ӧ���ֽ�
		 * csn:charset name
		 * �����ַ���
		 * gbk,utf-8,iso8859-1(ŷ�ޱ��룬��֧������)
		 */
		byte [] data = str.getBytes("utf-8");
		
		raf.write(data);
		
		System.out.println("д���ļ��ɹ�");
		
		raf.close();
	}

}
