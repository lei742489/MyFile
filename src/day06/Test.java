package day06;
/**
 * 递归调用：
 * 方法内部调用自己方法的现象称为递归调用
 * 递归现象允许程序执行到某个阶段时整体重新来过。
 * 使用递归需要注意：
 * 1：方法内部调用自己方法不能100%成产，否则是死循环
 * 2：递归层次尽量少，因为递归消耗内存可观，运行效率差。
 * 
 */
import java.io.File;

public class Test {

	public static void main(String[] args) {

		File file = new File("a");
		
		deleteall(file);
		
	}
	
	
	public static void delete(File file){
		
		if (file.exists()){
			
			if(file.isFile()){
				
				file.delete();
				System.out.println("文件删除成功！");
				
			}else if(file.isDirectory()){
				
				file.delete();
				System.out.println("目录删除成功！");
			}
			
			
		
		}else{
			System.out.println("文件不存在！");
		}
		
		
	}
	
	public static void deleteall(File file){
		
		if(file.isDirectory()){
			
			File [] files = file.listFiles();
			
			for(File f :files){
				
				deleteall(f);				//递归调用
			}
			
			
		}
		
		file.delete();
	}
}
