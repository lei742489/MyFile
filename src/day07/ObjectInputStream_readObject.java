package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day08.Person;

/**
 * ����������
 * ���ڷ����л�����
 * @author tarena
 *
 */
public class ObjectInputStream_readObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("Person.emp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person per = (Person) ois.readObject();
		
		System.out.println("��ȡ�ɹ�");
		
		System.out.println(per);
		ois.close();
	}

}
