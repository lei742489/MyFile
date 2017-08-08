package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写字符串
 * @author tarena
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
		
		String str ="中华人民共和国";
		/*
		 * byte[] getBytes(String csn)
		 * 将当前字符串按照给定字符集转换为一组对应的字节
		 * csn:charset name
		 * 常用字符集
		 * gbk,utf-8,iso8859-1(欧洲编码，不支持中文)
		 */
		byte [] data = str.getBytes("utf-8");
		
		raf.write(data);
		
		System.out.println("写入文件成功");
		
		raf.close();
	}

}
