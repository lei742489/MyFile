package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * ���������д�����ݵĻ���������
 * @author tarena
 *
 */

public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("fis.txt",true);		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "�л����񹲺͹��Ĵ��ɶ�\r\n";
		byte [] data = str.getBytes("UTF-8");
		
		bos.write(data);
		//һ���Խ�����������������д��
		bos.flush();
		System.out.println("д���ɹ�!");
		bos.close();
	}

}
