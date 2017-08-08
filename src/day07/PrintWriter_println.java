package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * java.io.PrintWriter
 * 缓冲字符输出流
 * 特点：可以按行写出字符，由于有缓冲，写出字符串效率高
 * 
 * 实际上PrintWriter自身的最大特点是支持“自动行刷新”功能
 * 而缓冲功能是靠其内嵌的BufferedWriter实现。因为实例化
 * PrintWriter时，它总会内部实例化BufferedWriter并与
 * 其连接。
 * @author tarena
 *
 */
public class PrintWriter_println {

	public static void main(String[] args) throws IOException {
		/*
		 * PW提供了很多构造方法，其中有直接对文件
		 * 写操作的构造方法：
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * 可以使用重载构造方法指定字符集
		 * PrintWriter(String path,String charsetName)
		 * PrintWriter(File file,String charsetName)
		 * 
		 */
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		
		pw.append("夜空中最亮的星。");
		pw.append("一二三四五六七八九");
		pw.close();
		
	}

}
