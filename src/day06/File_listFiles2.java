package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * 
 * File�ṩ��һ�����ص�listFiles�������÷�������ָ�� ���ļ�������
 * 
 * 
 * @author tarena
 *
 */
public class File_listFiles2 {

	public static void main(String[] args) {
		
		File file = new File(".");
		/*
		 * ��ȡ��ǰĿ¼�����ļ�
		 * 
		 */
		File [] files = file.listFiles(new FileFilter(){

			@Override	
			public boolean accept(File pathname) {			//��д�������������ļ�����
				
				String filename = pathname.getName();
				return filename.endsWith(".txt");
			}
			
		});
			for(File f : files){
				System.out.println(f.getName());
			}
	}

}
