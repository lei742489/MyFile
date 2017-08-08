package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 缓冲输出流写出数据的缓冲区问题
 * @author tarena
 *
 */

public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("fis.txt",true);		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "中华人民共和国四川成都\r\n";
		byte [] data = str.getBytes("UTF-8");
		
		bos.write(data);
		//一次性将缓冲区的所有数据写出
		bos.flush();
		System.out.println("写出成功!");
		bos.close();
	}

}
