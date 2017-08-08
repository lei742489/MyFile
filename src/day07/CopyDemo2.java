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
 * 缓冲流：
 * BufferedInputStream:缓冲输入流，提高读取效率
 * BuffererOutputStream:缓冲输出流，提高写出效率
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
		 * 缓冲流内部维护着一个缓冲区（字节数组）
		 * bis.read()看似读取一个字节，实际上缓冲流
		 * 会一次性通过fis读取一组字节，并存入内部维护的字节数组中，
		 * 然后将第一个字节返回。这样当再次调用bis.read()读取一个字节时
		 * 会直接从内部的字节数组将第二个字节返回。
		 * 所以缓冲流还是通过提高一次实际读取的字节量减少实际读取次数提高的效率
		 * 缓冲输出流也是类似原理
		 * 
		 * 
		 */
		int data = -1;
		long start = System.currentTimeMillis();
		while((data=bis.read())!=-1){
			
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制成功，用时："+(end-start)+"ms");
		
		bis.close();
		bos.close();
	}

}
