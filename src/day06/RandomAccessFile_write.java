package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * raf��������д�ļ����ݵġ������ָ����ж�д��������ָ�뵱ǰ
 * λ�ö�д�ֽڣ����Ҷ�д��Ϻ�ָ���Զ����ơ�
 * @author tarena
 *
 */
public class RandomAccessFile_write {

	public static void main(String[] args) throws IOException {

		/*
		 * RAF�����ֳ����Ĵ���ģʽ��
		 * 1��ֻ��ģʽ�����ж�ȡ�ļ�����
		 * 2����дģʽ��
		 * 
		 * RAF�ṩ����Ӧ�Ĺ��췽��
		 * RandomAccessFile(File file,String mode)
		 * RandomAccessFile(String path,String mode)
		 * ��һ������ָ��Ҫ��д���ļ����ڶ�������Ϊ�ַ��������õ�������
		 * 1:"rw":��дģʽ
		 * 2:"r":ֻ��ģʽ
		 */
		
		RandomAccessFile file = new RandomAccessFile("./test.dat","rw");
		
		//System.out.println("ִ�гɹ���");
		
		file.write(350);
		
		System.out.println("�����ɹ���");
		file.close();
	}

}
