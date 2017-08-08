package day08;
/**3
 * 
 * 重写父类含有throws异常抛出声明的方法时，子类对该方法重写的准则。
 */
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exception_throws {
	public void dosome() throws IOException,AWTException{
		
	}
	
	
}
class son extends Exception_throws{
	/*public void dosome()throws IOException,AWTException{
		
	}*/
	//可以不抛出任何异常
/*public void dosome(){
		
	}*/
	
	/*//允许抛出部分异常
	public void dosome()throws IOException{
		
	}*/
	
	/*//允许抛出父类方法抛出异常的子类型异常
	public void dosome()throws FileNotFoundException{
		
	}*/
	
	/*//不允许抛出额外异常
	public void dosome()throws SQLException{
		
	}*/
	
	/*//不允许抛出父类方法抛出异常的父类型异常
	public void dosome()throws Exception{
		
	}*/
}
