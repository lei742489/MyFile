package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *��ȡ�ļ����ݡ��� 
 * 
 * 
 * @author tarena
 *
 */
public class RandomAccessFile_read {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("test.dat","rw");
		
		/*
		 * int read();
		 * ��ȡһ���ֽڣ��������ֽڴ浽һ��intֵ��
		 * Ȼ�󷵻ظ�intֵ�������ص�intֵΪ-1�����ʾ��
		 * �ζ�ȡʱ���������ļ���ĩβ��
		 */
		
		int d = file.read();
		System.out.println(d);
		d = file.read();
		System.out.println(d);
		
	}

}
