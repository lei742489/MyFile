package day06;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * 
 * @author tarena
 *
 */
public class File_mkdirs {

	public static void main(String[] args) {

		File dir = new File("a"+File.separator+"b"+File.separator+"c"+File.separator+"d"+File.separator+"e"+File.separator);
		
		if (!dir.exists()){
			/*
			 * madirs�ĻὫҪ������Ŀ¼��������ͬʱ����
			 * ���ڵ�Ŀ¼һ������������
			 * 
			 * 
			 * 
			 * 
			 */
			dir.mkdirs();
			System.out.println("Ŀ¼�����ɹ���");
			
		}else{
			System.out.println("Ŀ¼�Ѿ�����");
		}
	}

}
