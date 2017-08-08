package day06;

import java.io.File;

/**
 * 创建一个多级目录
 * 
 * @author tarena
 *
 */
public class File_mkdirs {

	public static void main(String[] args) {

		File dir = new File("a"+File.separator+"b"+File.separator+"c"+File.separator+"d"+File.separator+"e"+File.separator);
		
		if (!dir.exists()){
			/*
			 * madirs的会将要创建的目录创建出来同时将不
			 * 存在的目录一并创建出来。
			 * 
			 * 
			 * 
			 * 
			 */
			dir.mkdirs();
			System.out.println("目录创建成功！");
			
		}else{
			System.out.println("目录已经存在");
		}
	}

}
