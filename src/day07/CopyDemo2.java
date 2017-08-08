package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * ��������
 * BufferedInputStream:��������������߶�ȡЧ��
 * BuffererOutputStream:��������������д��Ч��
 * @author tarena
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("tts9_cp2.zip");
		
		FileInputStream fis = new FileInputStream("tts9.zip");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		BufferedInputStream  bis = new BufferedInputStream(fis);
		/*
		 * �������ڲ�ά����һ�����������ֽ����飩
		 * bis.read()���ƶ�ȡһ���ֽڣ�ʵ���ϻ�����
		 * ��һ����ͨ��fis��ȡһ���ֽڣ��������ڲ�ά�����ֽ������У�
		 * Ȼ�󽫵�һ���ֽڷ��ء��������ٴε���bis.read()��ȡһ���ֽ�ʱ
		 * ��ֱ�Ӵ��ڲ����ֽ����齫�ڶ����ֽڷ��ء�
		 * ���Ի���������ͨ�����һ��ʵ�ʶ�ȡ���ֽ�������ʵ�ʶ�ȡ������ߵ�Ч��
		 * ���������Ҳ������ԭ��
		 * 
		 * 
		 */
		int data = -1;
		long start = System.currentTimeMillis();
		while((data=bis.read())!=-1){
			
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("���Ƴɹ�����ʱ��"+(end-start)+"ms");
		
		bis.close();
		bos.close();
	}

}
