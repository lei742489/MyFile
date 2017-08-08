package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * ʹ��raf��д�����������ݣ��Լ�raf��ָ��Ĳ�����
 * @author tarena
 *
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		
		/*
		 * logn getFilePointer()
		 * ����RAf��ǰָ��λ��
		 */
		
		//��������ʱָ�����ļ���ʼ
		long pos = raf.getFilePointer();
		
		System.out.println("point:"+pos);
		int imax = Integer.MAX_VALUE;
		
		raf.write(imax>>>24);
		System.out.println("point:"+ raf.getFilePointer());
		raf.write(imax>>>16);
		System.out.println("point:"+ raf.getFilePointer());
		raf.write(imax>>8);
		System.out.println("point:"+ raf.getFilePointer());
		raf.write(imax);
		System.out.println("point:"+ raf.getFilePointer());
		
		raf.writeInt(imax);
		System.out.println("point:"+ raf.getFilePointer());
		raf.writeLong(Long.MAX_VALUE);
		System.out.println("point:"+ raf.getFilePointer());
		raf.writeDouble(222.222);
		System.out.println("point:"+ raf.getFilePointer());
		
		
		//��ָ���ƶ����ļ���ʼ
		
		raf.seek(0);
		System.out.println("point:"+ raf.getFilePointer());
		
		//���ļ���ȡ����
		
		System.out.println(raf.readInt());
		
		raf.seek(4);
		System.out.println(raf.readInt());
		
		raf.seek(8);
		System.out.println(raf.readLong());
		
		System.out.println(raf.readDouble());
		
		System.out.println("point:"+ raf.getFilePointer());
		
		System.out.println("д��ɹ�");
		raf.close();
		
	}

}
