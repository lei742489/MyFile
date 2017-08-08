package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * 随机读写效率差，块读写效率高
 * 所以若希望提高读写效率，可以通过提高每次读写的
 * 数据量减少读写次数来达到。
 * @author tarena
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {

		/*
		 * RandomAccessFile提供了一次读写一组字节的方法：
		 * 
		 * int read(byte[] data)
		 * 一次性读取给定字节数组length的字节量，并
		 * 存入到该数组中，返回值为实际读取到的字节量
		 * 若返回值为-1表示本次没有读到任何字节，是文件的末尾。
		 * 
		 * void write(byte[] data)
		 * 将给定的字节娄组中所有字节一次性写出.
		 * 
		 * void write(byte[] data,int off, int len)
		 * 	将给定字节数级从下标offset处的字节开始的连接len个一次性写出
		 * 
		 * 	 
		 * 
		 * */
		RandomAccessFile file = new RandomAccessFile("tts9.zip", "r");
		RandomAccessFile file2 = new RandomAccessFile("tts9_cp.zip","rw");
		
		byte [] data =  new byte [1024*10];				//每次缓存10kb数据。
		
		int len = -1;
		
		long start = System.currentTimeMillis(); 
		
		while((len=file.read(data))!=-1){
			
			file2.write(data, 0, len);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("操作完毕，时间："+(end-start)+"ms");
	}

}
