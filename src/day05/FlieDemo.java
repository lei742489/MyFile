package day05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File的每一个实例用于表示文件系统中的一个文件或目录
 * 
 * 使用File可以：
 * 1:访问该文件或目录的属性信息（名字，大小，修改日期等）
 * 2：操作文件或目录（创建，删除）
 * 3：若表示的是目录，可以查看该目录中的子项信息，
 * 但不能访问文件中的数据
 * @author tarena
 *
 */
public class FlieDemo {

	public static void main(String[] args) {
		/*
		 * 在java程序中使用路径时，尽量使用相对路径
		 * 这样可以避免平台差异。
		 * 
		 * "."当前目录，有eclipse中当前目录指的是当前类所在项目的根目录。
		 */
		File file = new File("./demo.txt");
		
		String name = file.getName();	//获取文件名
		long size = file.length();		//获取文件字节
		
		
		boolean cr = file.canRead();	//判断可读
		boolean cw = file.canWrite();	//判断可写
		boolean ih = file.isHidden();	//判断隐藏
		
		long lasttime = file.lastModified();
		String path = file.getPath();
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
		
	  
		System.out.println("文件名："+name+"，\n大小："+ size+"字节，"+"\n路径："+path);
		System.out.println("可读："+cr+"，\n可写："+ cw+"\n隐藏："+ih+"\n最后修改日期："+ s.format(lasttime));
	}

}
