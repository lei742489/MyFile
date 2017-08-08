package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 
 * 完成记事本功能
 * 程序启动后，要求用户输入一个文件名，然后将控制台输入
 * 的每行字符串都写入到该文件中。
 * 当用户输入"exit"时，程序退出
 * @author tarena
 *
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String name = sc.next();
		writeFile(name);
		
	}
	
	public static void writeFile(String name) throws IOException{
		Scanner sc = new Scanner(System.in);
		String note = null;
		/*
		 * 当创建PrintWriter时，如果使用的构造方法
		 * 中第一个参数是一个流，那么就支持一个重载的构造方法
		 * 可以在传入一个boolean值的参数，该值若为true,则
		 * 当前PrintWriter具有自动行刷新功能，即：每当使用
		 * println方法写出一行字符串后会自动fluse，注意!
		 * 调用print方法不会flush
		 * 
		 * 
		 */
		
		PrintWriter pw = 
			new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(name,true),"utf-8"
						),true
				);
		System.out.println("请输入内容：");
		while(true){
			note = sc.nextLine();
			if("exit".equals(note)){
				System.out.println("你已退出，");
				break;
			}
			pw.println(note);
			
		}
		pw.close();
		sc.close();
		
	}
}
