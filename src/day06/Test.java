package day06;
/**
 * �ݹ���ã�
 * �����ڲ������Լ������������Ϊ�ݹ����
 * �ݹ������������ִ�е�ĳ���׶�ʱ��������������
 * ʹ�õݹ���Ҫע�⣺
 * 1�������ڲ������Լ���������100%�ɲ�����������ѭ��
 * 2���ݹ��ξ����٣���Ϊ�ݹ������ڴ�ɹۣ�����Ч�ʲ
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
				System.out.println("�ļ�ɾ���ɹ���");
				
			}else if(file.isDirectory()){
				
				file.delete();
				System.out.println("Ŀ¼ɾ���ɹ���");
			}
			
			
		
		}else{
			System.out.println("�ļ������ڣ�");
		}
		
		
	}
	
	public static void deleteall(File file){
		
		if(file.isDirectory()){
			
			File [] files = file.listFiles();
			
			for(File f :files){
				
				deleteall(f);				//�ݹ����
			}
			
			
		}
		
		file.delete();
	}
}
