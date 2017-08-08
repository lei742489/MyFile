package day11;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * �����ҿͻ���
 */
public class Client {
	/*
	 * java.net.Socket
	 * �׽��֣���װ��TcpЭ�飬ʹ����������Զ�˼����ͨѶ��
	 */
	private Socket socket;
	/*
	 * ���췽������ʼ���ͻ���
	 * ʵ����Socket��Ҫ��������������
	 * 1.������IP��ַ
	 * 2.�������˿�
	 * 
	 * ʵ����Socket�Ĺ��̾������ӷ���˵Ĺ���
	 * �����������Ӧ��ʵ�������̻��׳��쳣
	 * 
	 * �˿ں���һ��������2�ֽ��ڵ�����0-65535
	 * ��3000���ڵĶ˿ںŲ�Ҫʹ�ã���Ϊ���ܵİ�
	 * ��ϵͳ���򣬺����������̵�Ӧ�ó���
	 * 10000�����Ժ��ٱ�ʹ��
	 */
	public Client() throws Exception{
		try{
			socket = new Socket("127.0.0.1",8088);
		}catch(Exception e){
			//��¼��־
			throw e;
		}
		
	}
	/*
	 * �ͻ�����������
	 */
	public void start(){
		try {
			Scanner sc = new Scanner(System.in);
			/*
			 * Socket�ṩ������
			 * OutputStream getOutputStream()
			 * ͨ����ȡ�������д�������ݾͿ���ͨ�����緢��
			 * ��Զ�˼���������ڿͻ��˶���Զ�˾��Ƿ�����
			 */
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
						
			PrintWriter pw = new PrintWriter(osw,true);
			//������Ϣ�߳�����
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			System.out.println("�������������ݣ�");
			long time = System.currentTimeMillis()-500;
			String message =null;
			while(true){
				message =  sc.nextLine();
			pw.println(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Client client;
		try {
			client = new Client();
			client.start();
		} catch (Exception e) {
			 
			System.out.println("�ͻ�������ʧ�ܣ������������ӡ���");
		}
		
	}


	private class ServerHandler implements Runnable{
		
		public void run() {
			
			try {
				
				InputStream in =socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String message = null;
				while((message = br.readLine())!=null){
					
					System.out.println(message);
				}
				
			} catch (Exception e) {
				
			}
		}
		
	}
}