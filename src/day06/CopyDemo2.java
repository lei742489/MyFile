package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * �����дЧ�ʲ���дЧ�ʸ�
 * ������ϣ����߶�дЧ�ʣ�����ͨ�����ÿ�ζ�д��
 * ���������ٶ�д�������ﵽ��
 * @author tarena
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {

		/*
		 * RandomAccessFile�ṩ��һ�ζ�дһ���ֽڵķ�����
		 * 
		 * int read(byte[] data)
		 * һ���Զ�ȡ�����ֽ�����length���ֽ�������
		 * ���뵽�������У�����ֵΪʵ�ʶ�ȡ�����ֽ���
		 * ������ֵΪ-1��ʾ����û�ж����κ��ֽڣ����ļ���ĩβ��
		 * 
		 * void write(byte[] data)
		 * ���������ֽ�¦���������ֽ�һ����д��.
		 * 
		 * void write(byte[] data,int off, int len)
		 * 	�������ֽ��������±�offset�����ֽڿ�ʼ������len��һ����д��
		 * 
		 * 	 
		 * 
		 * */
		RandomAccessFile file = new RandomAccessFile("tts9.zip", "r");
		RandomAccessFile file2 = new RandomAccessFile("tts9_cp.zip","rw");
		
		byte [] data =  new byte [1024*10];				//ÿ�λ���10kb���ݡ�
		
		int len = -1;
		
		long start = System.currentTimeMillis(); 
		
		while((len=file.read(data))!=-1){
			
			file2.write(data, 0, len);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("������ϣ�ʱ�䣺"+(end-start)+"ms");
	}

}
