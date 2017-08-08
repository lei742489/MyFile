package day06;

import java.io.File;

/**
 * 创建一个目录
 * @author tarena
 *
 */
public class File_mkdir {

	public static void main(String[] args) {

		File dir = new File('.'+File.separator+"demo");
		
		if(!dir.exists()){
			
			dir.mkdir();
			System.out.println("目录创建成功！");
			
		}else{
			
			System.out.println("目录已存在！");
		}
		
	}

}
