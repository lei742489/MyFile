package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * �����ҷ����
 * @author tarena
 *
 */
public class Server {
	/**
	 * �����ڷ���˵�ServerSocket��Ҫ��������������
	 * 1����ϵͳ�������˿ڣ��ͻ��˾���ͨ�����
	 * 	   �˿�������Ӧ�ó��������ӵ�
	 * 2����������˿ڣ�һ���ͻ���ͨ���ö˿ڳ�������ʱ
	 *   ServerSocket�ͻ�ʵ����һ��Socket���
	 *   �ͻ���ͨѶ��
	 * 
	 */
	private ServerSocket server;
	/*
	 * ������пͻ��˵�����������ڹ㲥��Ϣ
	 */
	private List<PrintWriter> allOut;
	public Server(){
		try {
			/*
			 * ʵ����ServerSocketʱ��Ҫָ������˿ڣ�
			 * �ͻ��˾���ͨ������˿������˽������ӵġ�
			 * 
			 * �ö˿ڲ�����ϵͳ������������Ķ˿ڳ�ͻ�������
			 * �׳��쳣
			 * address already in use
			 */
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		try	{
			/*
			 * ServerSocket�ṩ������
			 * Socket accept()
			 * �÷�����һ���������������ú��һ�µȴ��ͻ��˵����ӣ�
			 * һ��һ���ͻ���ͨ��ServerSocket����Ķ˿ڽ���
			 * ���ӣ���ôaccept�����᷵��һ��Socketʵ����ͨ��
			 * ��Socketʵ�������뽨�����ӵĿͻ��˽���ͨѶ��
			 */
			while(true){
			System.out.println("�ȴ��ͻ�������......");
			
			Socket socket = server.accept();
			System.out.println("һ���ͻ���������.");
			//����һ���߳�������ÿͻ��˽���
			ClientHandler client = new ClientHandler(socket);
			Thread t = new Thread (client);
			t.start();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		try{
			Server server = new Server();
			server.start();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("���������ʧ��");
		}
	}
	/**
	 * �� �߳������ڴ�����ָ���ͻ��˵Ľ�������
	 * @author tarena
	 *
	 */
	private class ClientHandler implements Runnable{
		//��ǰ�߳�ͨ�����Socket��ָ���ͻ��˽���
		private Socket socket;
		private String host;		//�ͻ��˵ĵ�ַ��Ϣ
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//ͨ��Socket��ȡԶ�˼������ַ��Ϣ
			InetAddress address = socket.getInetAddress();
			//��ȡiP��ַ���ַ�����ʽ
			host = address.getHostAddress();
			
			
		}


		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * Socket�ṩ������
				 * InputStream getInputStyream()
				 * ͨ����ȡ����������ȡ���ֽھ�������Զ��
				 * ���͹��������ݣ����ڷ���˶��ԣ�Զ��ָ��
				 * ���ǿͻ���.
				 */
				
				InputStream in  = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"utf-8");
				BufferedReader br = new BufferedReader(isr);
				/*
				 * ͨ��Socket��ȡ����������ڽ���Ϣ���͸��ͻ���
				 * 
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
				pw = new PrintWriter(osw,true);
				//���ÿͻ��˵���������빲����
				synchronized (allOut) {
					allOut.add(pw);
				}
			
				
				String message = null;
				/*
				 * ʹ��br.readline��ȡ�ͻ��˷��͹�����
				 * һ���ַ���ʱ���÷����ᴦ������״̬��ֱ��
				 * �ͻ�����ʵ���͹���һ�У�����Ż᷵��
				 * ���ǵ��ͻ��˶Ͽ�����ʱ��br.readLine
				 * ����ݿͻ��˲�ͬ����ϵͳ�в�ͬ�ķ�����
				 * ��windows�Ŀͻ��˶Ͽ���br.readLine
				 * �������׳��쳣��
				 * ��linux�Ŀͻ��˶Ͽ���br.readLine����
				 * �᷵��null��
				 */
				while((message=br.readLine())!=null){
					/*
					 * ����Ϣת�������пͻ���
					 * 
					 * �߳��ڱ�������ʱ�Ĳ���Ҫ�뼯�ϵ�
					 * ��ɾԪ�ػ���
					 */
					
					synchronized (allOut) {
						for(PrintWriter p : allOut){
							p.write(host+"˵:"+message);
						}
					}
					
				}
				
				
			} catch (Exception e) {
				
			}finally{
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				//���ÿͻ��˵�������ӹ��������Ƴ�
				synchronized (allOut) {
					allOut.remove(pw);
				}
				try {
					socket.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}
}
