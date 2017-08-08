package day06;

import java.io.File;

/**
 * 删除一个目录
 * 
 * @author tarena
 *
 */
public class File_delete2 {

	public static void main(String[] args) {
		
		File dir = new File("."+File.separator+"demo");
		
		if(dir.exists()){
			/*
			 * 将当前目录下的demo目录删除
			 * 直接指定文件名或目录名，那么该文件或目录默认是在当前目录中
			 * 
			 * 
			 * 删除一个目录的前提条件是该目录必须是一个空目录才可以将其删除
			 */
			dir.delete();
			System.out.println("目录删除成功");
			
		}else{
			System.out.println("目录不存在");
		}
		
		

	}

}
