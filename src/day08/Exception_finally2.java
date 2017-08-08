package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 异常捕获在IO中应用。
 * @author tarena
 *
 */
public class Exception_finally2 {

	public static void main(String[] args) {

		BufferedReader br =null;
		try {
			br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("./src/day08/Exception_finally2.java"),"GBK")
					);
			String str =null;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("未找到指定文件！");


		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
