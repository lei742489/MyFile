package day06;

import java.io.File;

/**
 * ����һ��Ŀ¼
 * @author tarena
 *
 */
public class File_mkdir {

	public static void main(String[] args) {

		File dir = new File('.'+File.separator+"demo");
		
		if(!dir.exists()){
			
			dir.mkdir();
			System.out.println("Ŀ¼�����ɹ���");
			
		}else{
			
			System.out.println("Ŀ¼�Ѵ��ڣ�");
		}
		
	}

}
