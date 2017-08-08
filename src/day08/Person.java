package day08;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.management.RuntimeErrorException;

/**
 * 
 * 用于测试对象流进行对象的读写操作
 * 如果一个类的实例希望被对象流进行读写，那么该类
 * 必须实现Serializable接口
 * 
 * 将一个对象通过对象列转换为字节后并写入文件的操作
 * 涉及两个专业名词：
 * 
 * 1.对象序列化
 *	 对象序列化就是将一个java中的对象按照其结构
 *	 转化为一组字节的过程（对象输出流完成）
 * 2.持久化
 * 	 将一组字节写入文件（硬盘上）的过程称为持久化
 * @author tarena
 *
 */
public class Person implements Serializable{
		
		/**
	 *  	当一个类实现了序列化接口后，就应当定义一个常量：
	 *  serialVersionUID,序列化版本号
	 *  序列化版本号决定反序列化操作是否成功。
	 *  
	 *  当对象输入流在将一组字节进行反序列化时会对
	 *  该对象与其对应的类进行版本号比较，若一致则
	 *  反序列化，若不一致则抛出版本号不一致的异常
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		private int age;
		private String gender;
		/*
		 * 被transient修饰的属性在对象序列化时
		 * 其值会被忽略
		 * 将可有可无的属性忽略可以达到对象序列化"瘦身"的效果
		 * 
		 */
		private transient List<String> otherInfo;
		
		public Person(String name, int age, String gender, List<String> otherInfo) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.otherInfo = otherInfo;
		}
		
		

		public Person() {
			super();
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) throws IllegalAgeException{
			if(age<0||age>100){
				/*
				 * 当一个方法中使用throw抛出一个异常时
				 * (除了RuntimeException及其子类异常)
				 * 编译器要求必须在该方法上使用throws声明
				 * 这类异常的抛出。否则编译不通过。
				 */
				throw new IllegalAgeException("年龄超范围");
			}
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public List<String> getOtherInfo() {
			return otherInfo;
		}

		public void setOtherInfo(List<String> otherInfo) {
			this.otherInfo = otherInfo;
		}

		@Override
		public String toString() {
			return name + "," + age + "," + gender + "," + otherInfo ;
		}
		
		
}
