package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import day08.Person;

/**
 * 对象输入流
 * 用于反序列化对象
 * @author tarena
 *
 */
public class ObjectInputStream_readObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("Person.emp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person per = (Person) ois.readObject();
		
		System.out.println("读取成功");
		
		System.out.println(per);
		ois.close();
	}

}
