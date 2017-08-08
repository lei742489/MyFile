package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 
 * ��ɼ��±�����
 * ����������Ҫ���û�����һ���ļ�����Ȼ�󽫿���̨����
 * ��ÿ���ַ�����д�뵽���ļ��С�
 * ���û�����"exit"ʱ�������˳�
 * @author tarena
 *
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String name = sc.next();
		writeFile(name);
		
	}
	
	public static void writeFile(String name) throws IOException{
		Scanner sc = new Scanner(System.in);
		String note = null;
		/*
		 * ������PrintWriterʱ�����ʹ�õĹ��췽��
		 * �е�һ��������һ��������ô��֧��һ�����صĹ��췽��
		 * �����ڴ���һ��booleanֵ�Ĳ�������ֵ��Ϊtrue,��
		 * ��ǰPrintWriter�����Զ���ˢ�¹��ܣ�����ÿ��ʹ��
		 * println����д��һ���ַ�������Զ�fluse��ע��!
		 * ����print��������flush
		 * 
		 * 
		 */
		
		PrintWriter pw = 
			new PrintWriter(
				new OutputStreamWriter(
						new FileOutputStream(name,true),"utf-8"
						),true
				);
		System.out.println("���������ݣ�");
		while(true){
			note = sc.nextLine();
			if("exit".equals(note)){
				System.out.println("�����˳���");
				break;
			}
			pw.println(note);
			
		}
		pw.close();
		sc.close();
		
	}
}
