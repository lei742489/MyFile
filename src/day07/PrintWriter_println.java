package day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * java.io.PrintWriter
 * �����ַ������
 * �ص㣺���԰���д���ַ��������л��壬д���ַ���Ч�ʸ�
 * 
 * ʵ����PrintWriter���������ص���֧�֡��Զ���ˢ�¡�����
 * �����幦���ǿ�����Ƕ��BufferedWriterʵ�֡���Ϊʵ����
 * PrintWriterʱ�����ܻ��ڲ�ʵ����BufferedWriter����
 * �����ӡ�
 * @author tarena
 *
 */
public class PrintWriter_println {

	public static void main(String[] args) throws IOException {
		/*
		 * PW�ṩ�˺ܶ๹�췽����������ֱ�Ӷ��ļ�
		 * д�����Ĺ��췽����
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 
		 * ����ʹ�����ع��췽��ָ���ַ���
		 * PrintWriter(String path,String charsetName)
		 * PrintWriter(File file,String charsetName)
		 * 
		 */
		PrintWriter pw = new PrintWriter("pw.txt","utf-8");
		
		pw.append("ҹ�����������ǡ�");
		pw.append("һ�����������߰˾�");
		pw.close();
		
	}

}
