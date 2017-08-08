package day06;

import java.io.File;

/**
 * 
 * ��ȡһ��Ŀ¼�е���������
 * @author tarena
 *
 */
public class File_listFiles {
	
		public static void main(String[] args) {
			
			/*
			 * �鿴��ǰĿ¼�е���������
			 */
			File dir = new File(".");
			
			/*
			 * boolean isFile();
			 * �жϵ�ǰFile��ʾ���Ƿ���һ���ļ�
			 * 
			 * boolean is Directory();
			 * �жϵ�ǰFile��ʾ���Ƿ���һ��Ŀ¼
			 * 
			 */
			if(dir.isDirectory()){				//�ж������ǰ�ļ��Ƿ�ΪĿ¼
				
				File [] list = dir.listFiles(); //��ȡ��ǰĿ¼�����ļ�
				
				for(File f : list){
					if(f.isFile()){
						System.out.print("�ļ���");
					}
					if(f.isDirectory()){
						System.out.print("Ŀ¼:");
					}
					System.out.println(f.getName());
				}
				
			}
		}
}
