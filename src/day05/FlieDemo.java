package day05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File��ÿһ��ʵ�����ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * 
 * ʹ��File���ԣ�
 * 1:���ʸ��ļ���Ŀ¼��������Ϣ�����֣���С���޸����ڵȣ�
 * 2�������ļ���Ŀ¼��������ɾ����
 * 3������ʾ����Ŀ¼�����Բ鿴��Ŀ¼�е�������Ϣ��
 * �����ܷ����ļ��е�����
 * @author tarena
 *
 */
public class FlieDemo {

	public static void main(String[] args) {
		/*
		 * ��java������ʹ��·��ʱ������ʹ�����·��
		 * �������Ա���ƽ̨���졣
		 * 
		 * "."��ǰĿ¼����eclipse�е�ǰĿ¼ָ���ǵ�ǰ��������Ŀ�ĸ�Ŀ¼��
		 */
		File file = new File("./demo.txt");
		
		String name = file.getName();	//��ȡ�ļ���
		long size = file.length();		//��ȡ�ļ��ֽ�
		
		
		boolean cr = file.canRead();	//�жϿɶ�
		boolean cw = file.canWrite();	//�жϿ�д
		boolean ih = file.isHidden();	//�ж�����
		
		long lasttime = file.lastModified();
		String path = file.getPath();
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd HH:mm:ss");
		
	  
		System.out.println("�ļ�����"+name+"��\n��С��"+ size+"�ֽڣ�"+"\n·����"+path);
		System.out.println("�ɶ���"+cr+"��\n��д��"+ cw+"\n���أ�"+ih+"\n����޸����ڣ�"+ s.format(lasttime));
	}

}
