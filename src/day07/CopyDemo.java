package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ��������ļ�
 * @author tarena
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
			/*
			 * ʹ���ļ���������ԭ�ļ��е������ֽ�˳��Ķ�ȡ���������ļ������д�뵽��һ���ļ���
			 * 
			 */
		
		FileOutputStream fos =  new FileOutputStream("tts9_cp.zip");	//д
		
		FileInputStream fis = new FileInputStream("tts9.zip");		//��
		
		byte [] data = new byte [1024*10];
		
		int len =-1 ;
		long start = System.currentTimeMillis();
		while((len=fis.read(data))!=-1){
			
			fos.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("���Ƴɹ�����ʱ��"+(end-start));
		fis.close();
		fos.close();
		
	}

}
