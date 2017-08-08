package day06;

import java.io.File;

/**
 * 删除一个文件
 * @author tarena
 *
 */
public class File_delete {

	public static void main(String[] args) {
		
		File file = new File("."+File.separator+"text.txt");
		
			if (file.exists()){
				
				file.delete();
				System.out.println("文件删除成功!");
				
			}else{
				
				System.out.println("文件不存在！");
			}
				
		/*
		 * 将当前目录中的text.txt文件删除
		 */
	}

}
