package day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ���ļ�
 * @author tarena
 *
 */
public class File_createNewFile {

	public static void main(String[] args) throws IOException {
		File file = new File("a"+File.separator+"b"+File.separator+"text.txt");
		
		if (!file.exists()){					//file.existes �ж��ļ��Ƿ����
			
			file.createNewFile();
			System.out.println("�ļ������ɹ���");
			
		}else{
			
			System.out.println("�ļ��Ѵ��ڣ���");
		}
		
		
	}

}
