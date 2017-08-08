package day06;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * @author tarena
 *
 */
public class File_createNewFile {

	public static void main(String[] args) throws IOException {
		File file = new File("a"+File.separator+"b"+File.separator+"text.txt");
		
		if (!file.exists()){					//file.existes 判断文件是否存在
			
			file.createNewFile();
			System.out.println("文件创建成功！");
			
		}else{
			
			System.out.println("文件已存在！。");
		}
		
		
	}

}
