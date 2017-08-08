package day06;

import java.io.File;

/**
 * 
 * 获取一个目录中的所有子项
 * @author tarena
 *
 */
public class File_listFiles {
	
		public static void main(String[] args) {
			
			/*
			 * 查看当前目录中的所有子项
			 */
			File dir = new File(".");
			
			/*
			 * boolean isFile();
			 * 判断当前File表示的是否是一个文件
			 * 
			 * boolean is Directory();
			 * 判断当前File表示的是否是一个目录
			 * 
			 */
			if(dir.isDirectory()){				//判断如果当前文件是否为目录
				
				File [] list = dir.listFiles(); //获取当前目录所有文件
				
				for(File f : list){
					if(f.isFile()){
						System.out.print("文件：");
					}
					if(f.isDirectory()){
						System.out.print("目录:");
					}
					System.out.println(f.getName());
				}
				
			}
		}
}
