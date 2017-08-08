package day07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * java.io.BufferedReader
 * �����ַ�������
 * ���԰��ж�ȡ�ַ���
 * @author tarena
 *
 */
public class BufferedReader_readLine {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("."+File.separator+"src"
				+File.separator+"day08"+File.separator+"Person.java");
		
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = null;
		while((str=br.readLine())!=null){
			
			System.out.println(str);
		}
		br.close();
	}

}
