package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * raf是用来读写文件数据的。其基于指针进行读写，总是在指针当前
 * 位置读写字节，并且读写完毕后指针自动后移。
 * @author tarena
 *
 */
public class RandomAccessFile_write {

	public static void main(String[] args) throws IOException {

		/*
		 * RAF有两种常见的创建模式：
		 * 1：只读模式，进行读取文件数据
		 * 2：读写模式。
		 * 
		 * RAF提供了相应的构造方法
		 * RandomAccessFile(File file,String mode)
		 * RandomAccessFile(String path,String mode)
		 * 第一个参数指定要读写的文件，第二个参数为字符串，常用的两个：
		 * 1:"rw":读写模式
		 * 2:"r":只读模式
		 */
		
		RandomAccessFile file = new RandomAccessFile("./test.dat","rw");
		
		//System.out.println("执行成功！");
		
		file.write(350);
		
		System.out.println("操作成功！");
		file.close();
	}

}
