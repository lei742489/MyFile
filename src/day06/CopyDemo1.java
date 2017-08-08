package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 * @author tarena
 *
 */
public class CopyDemo1 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile ("google.exe","r");
		
		RandomAccessFile file2 = new RandomAccessFile("google_cp.exe", "rw");
		
		int d = -1;
		long start = System.currentTimeMillis();
		while((d = file.read())!=-1){
			file2.write(d);
		}
		long end = System.currentTimeMillis();
		 System.out.println("操作完毕！用时："+(end-start)+"ms");
		 
		 file.close();
		 file2.close();
	}

}
