package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * 字符流：
 * 		字符流与字节流的区别在于读写单位为：字符
 * 		但是字符流底层本质还是读写字节，只是字符与字节的转换
 * 		工作交给了字符流来完成。
 * 
 * Reader是所有字符输入流的父类，规定了读取字符的相关方法
 * Writer是所有字符输出流的父类，规定了写出字符的相关方法
 * 
 * 转换流：
 * 		InputStreamReader,OutputStreamWriter
 * 		它们是字符流的一对常见的实现类。
 * @author tarena
 *
 */
public class OutputStreamWriter_write {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("fos.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("中华人民共和国四川省成都市");
		osw.write("\r\n民砂有进怀肯示下百羃晨");
		
		System.out.println("写出成功!");
		osw.close();
	}

}
