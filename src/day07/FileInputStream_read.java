package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
	 * 文件输入流
	 * @author tarena
	 *
	 */
public class FileInputStream_read {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte [] data = new byte[800];
		int len = fis.read(data);
		String str = new String(data,0,len,"utf-8");
		
		System.out.println(str);
		fis.close();
		
	}

}
