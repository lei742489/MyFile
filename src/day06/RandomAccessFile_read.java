package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *读取文件数据。。 
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
		 * 读取一个字节，并将该字节存到一个int值中
		 * 然后返回该int值，若返回的int值为-1，则表示本
		 * 次读取时发现是在文件的末尾，
		 */
		
		int d = file.read();
		System.out.println(d);
		d = file.read();
		System.out.println(d);
		
	}

}
