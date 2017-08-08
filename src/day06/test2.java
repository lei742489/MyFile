package day06;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		StringBuilder str ;
			
			
	}
	
		
	public static StringBuilder radmon(){
		
		Random rad =new Random();
		
		StringBuilder str= new StringBuilder();
		
		for (int i =0; i<10;i++){
			
			str.append((char)('A'+rad.nextInt(25)));
		}
		
		return str;
	}
}
