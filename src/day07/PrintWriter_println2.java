package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PrintWriter
 * 
 * @author tarena
 *
 */
public class PrintWriter_println2 {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = 
			new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream("pw2.txt",true),"utf-8"
						)
				);
		
		pw.println("一二三四在兴进");
		pw.println("一在有有地苛夺进");
		pw.close();
		System.out.println("写出完毕");
	}

}
