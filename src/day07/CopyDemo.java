package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * @author tarena
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
			/*
			 * 使用文件输入流将原文件中的所有字节顺序的读取出来再用文件输出流写入到另一个文件中
			 * 
			 */
		
		FileOutputStream fos =  new FileOutputStream("tts9_cp.zip");	//写
		
		FileInputStream fis = new FileInputStream("tts9.zip");		//读
		
		byte [] data = new byte [1024*10];
		
		int len =-1 ;
		long start = System.currentTimeMillis();
		while((len=fis.read(data))!=-1){
			
			fos.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制成功，用时："+(end-start));
		fis.close();
		fos.close();
		
	}

}
