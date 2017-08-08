package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * 使用raf读写基本类型数据，以及raf对指针的操作。
 * @author tarena
 *
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		
		/*
		 * logn getFilePointer()
		 * 返回RAf当前指针位置
		 */
		
		//创建出来时指针在文件开始
		long pos = raf.getFilePointer();
		
		System.out.println("point:"+pos);
		int imax = Integer.MAX_VALUE;
		
		raf.write(imax>>>24);
		System.out.println("point:"+ raf.getFilePointer());
		raf.write(imax>>>16);
		System.out.println("point:"+ raf.getFilePointer());
		raf.write(imax>>8);
		System.out.println("point:"+ raf.getFilePointer());
		raf.write(imax);
		System.out.println("point:"+ raf.getFilePointer());
		
		raf.writeInt(imax);
		System.out.println("point:"+ raf.getFilePointer());
		raf.writeLong(Long.MAX_VALUE);
		System.out.println("point:"+ raf.getFilePointer());
		raf.writeDouble(222.222);
		System.out.println("point:"+ raf.getFilePointer());
		
		
		//将指针移动到文件开始
		
		raf.seek(0);
		System.out.println("point:"+ raf.getFilePointer());
		
		//从文件读取数据
		
		System.out.println(raf.readInt());
		
		raf.seek(4);
		System.out.println(raf.readInt());
		
		raf.seek(8);
		System.out.println(raf.readLong());
		
		System.out.println(raf.readDouble());
		
		System.out.println("point:"+ raf.getFilePointer());
		
		System.out.println("写入成功");
		raf.close();
		
	}

}
