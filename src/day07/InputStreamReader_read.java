package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ×ª»»ÊäÈëÁ÷ InputStreamReader
 * @author tarena
 *
 */
public class InputStreamReader_read {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("fos.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		List<Character> data = new ArrayList<Character>();
		
		int d = -1;
		while((d=isr.read())!=-1 ){
			data.add((char)d);
			//System.out.print((char)d);
		}
		for(char c : data){
			System.out.print(c);
		}
		isr.close();
	}

}
