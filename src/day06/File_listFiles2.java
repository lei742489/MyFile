package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * File提供了一个重载的listFiles方法，该方法可以指定 个文件过滤器
 * 
 * 
 * @author tarena
 *
 */
public class File_listFiles2 {

	public static void main(String[] args) {
		
		File file = new File(".");
		/*
		 * 获取当前目录所有文件
		 * 
		 */
		File [] files = file.listFiles(new FileFilter(){

			@Override	
			public boolean accept(File pathname) {			//重写过滤器，返回文件类型
				
				String filename = pathname.getName();
				return filename.endsWith(".txt");
			}
			
		});
			for(File f : files){
				System.out.println(f.getName());
			}
	}

}
