package day06;

import java.io.File;

/**
 * ɾ��һ��Ŀ¼
 * 
 * @author tarena
 *
 */
public class File_delete2 {

	public static void main(String[] args) {
		
		File dir = new File("."+File.separator+"demo");
		
		if(dir.exists()){
			/*
			 * ����ǰĿ¼�µ�demoĿ¼ɾ��
			 * ֱ��ָ���ļ�����Ŀ¼������ô���ļ���Ŀ¼Ĭ�����ڵ�ǰĿ¼��
			 * 
			 * 
			 * ɾ��һ��Ŀ¼��ǰ�������Ǹ�Ŀ¼������һ����Ŀ¼�ſ��Խ���ɾ��
			 */
			dir.delete();
			System.out.println("Ŀ¼ɾ���ɹ�");
			
		}else{
			System.out.println("Ŀ¼������");
		}
		
		

	}

}
