package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ��������һ�Ը߼����������Ƿ����дjava�еĶ���
 * 
 * java.io.ObjectOutputStream
 * ��������������Խ������Ķ���ת��Ϊһ���ֽڣ�Ȼ��ͨ��
 * �䴦������������ֽ�д��
 * @author tarena
 *
 */
public class ObjectoutputStream_writeObject {

	public static void main(String[] args) throws Exception {

		Person per = new Person();
		per.setName("����ʦ");
		per.setAge(18);
		per.setGender("Ů");
		
		List<String> otherInfo = new ArrayList<String>();
		
		otherInfo.add("��һ��Ա��");
		otherInfo.add("������д�鷨");
		otherInfo.add("�����ڴٽ������Ļ�����");
		otherInfo.add("�������ͬ����������ʦ");
		
		per.setOtherInfo(otherInfo);
		
		FileOutputStream fos = new FileOutputStream("Person.emp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(per);
		
		System.out.println("д���ɹ�.");
		oos.close();
		
	}

}
