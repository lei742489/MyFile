package day08;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.management.RuntimeErrorException;

/**
 * 
 * ���ڲ��Զ��������ж���Ķ�д����
 * ���һ�����ʵ��ϣ�������������ж�д����ô����
 * ����ʵ��Serializable�ӿ�
 * 
 * ��һ������ͨ��������ת��Ϊ�ֽں�д���ļ��Ĳ���
 * �漰����רҵ���ʣ�
 * 
 * 1.�������л�
 *	 �������л����ǽ�һ��java�еĶ�������ṹ
 *	 ת��Ϊһ���ֽڵĹ��̣������������ɣ�
 * 2.�־û�
 * 	 ��һ���ֽ�д���ļ���Ӳ���ϣ��Ĺ��̳�Ϊ�־û�
 * @author tarena
 *
 */
public class Person implements Serializable{
		
		/**
	 *  	��һ����ʵ�������л��ӿں󣬾�Ӧ������һ��������
	 *  serialVersionUID,���л��汾��
	 *  ���л��汾�ž��������л������Ƿ�ɹ���
	 *  
	 *  �������������ڽ�һ���ֽڽ��з����л�ʱ���
	 *  �ö��������Ӧ������а汾�űȽϣ���һ����
	 *  �����л�������һ�����׳��汾�Ų�һ�µ��쳣
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		private int age;
		private String gender;
		/*
		 * ��transient���ε������ڶ������л�ʱ
		 * ��ֵ�ᱻ����
		 * �����п��޵����Ժ��Կ��Դﵽ�������л�"����"��Ч��
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
				 * ��һ��������ʹ��throw�׳�һ���쳣ʱ
				 * (����RuntimeException���������쳣)
				 * ������Ҫ������ڸ÷�����ʹ��throws����
				 * �����쳣���׳���������벻ͨ����
				 */
				throw new IllegalAgeException("���䳬��Χ");
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
