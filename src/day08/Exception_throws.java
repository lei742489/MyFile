package day08;
/**3
 * 
 * ��д���ຬ��throws�쳣�׳������ķ���ʱ������Ը÷�����д��׼��
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
	//���Բ��׳��κ��쳣
/*public void dosome(){
		
	}*/
	
	/*//�����׳������쳣
	public void dosome()throws IOException{
		
	}*/
	
	/*//�����׳����෽���׳��쳣���������쳣
	public void dosome()throws FileNotFoundException{
		
	}*/
	
	/*//�������׳������쳣
	public void dosome()throws SQLException{
		
	}*/
	
	/*//�������׳����෽���׳��쳣�ĸ������쳣
	public void dosome()throws Exception{
		
	}*/
}
