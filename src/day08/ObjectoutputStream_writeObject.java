package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 对象流是一对高级流，作用是方便读写java中的对象。
 * 
 * java.io.ObjectOutputStream
 * 对象输出流，可以将给定的对象转换为一组字节，然后通过
 * 其处理的流将这组字节写出
 * @author tarena
 *
 */
public class ObjectoutputStream_writeObject {

	public static void main(String[] args) throws Exception {

		Person per = new Person();
		per.setName("苍老师");
		per.setAge(18);
		per.setGender("女");
		
		List<String> otherInfo = new ArrayList<String>();
		
		otherInfo.add("是一演员，");
		otherInfo.add("爱好是写书法");
		otherInfo.add("致力于促进中日文化交流");
		otherInfo.add("广大男性同胞的启蒙老师");
		
		per.setOtherInfo(otherInfo);
		
		FileOutputStream fos = new FileOutputStream("Person.emp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(per);
		
		System.out.println("写出成功.");
		oos.close();
		
	}

}
