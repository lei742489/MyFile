package day06;

import java.io.File;

/**
 * ɾ��һ���ļ�
 * @author tarena
 *
 */
public class File_delete {

	public static void main(String[] args) {
		
		File file = new File("."+File.separator+"text.txt");
		
			if (file.exists()){
				
				file.delete();
				System.out.println("�ļ�ɾ���ɹ�!");
				
			}else{
				
				System.out.println("�ļ������ڣ�");
			}
				
		/*
		 * ����ǰĿ¼�е�text.txt�ļ�ɾ��
		 */
	}

}
