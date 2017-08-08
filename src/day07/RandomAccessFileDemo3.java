package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符串
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
		 * 将给定字节数组中所有字节按照当前系统默认
		 * 字符集转换为对应原字符串
		 * 
		 * String(Byte[] data, int offset,int len)
		 * 将给定字节数组从下村offset处开始的连续len个字节按照
		 * 系统默认字符集转换为字符串
		 * 
		 * 
		 */
		String str =  new String(data,0,len,"utf-8");
		
		System.out.println(str);
		raf.close();
	}

}
