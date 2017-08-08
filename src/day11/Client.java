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
 * 聊天室客户端
 */
public class Client {
	/*
	 * java.net.Socket
	 * 套接字，封装了Tcp协议，使用它可以与远端计算机通讯。
	 */
	private Socket socket;
	/*
	 * 构造方法，初始化客户端
	 * 实例化Socket需要传入两个参数：
	 * 1.服务器IP地址
	 * 2.服务器端口
	 * 
	 * 实例化Socket的过程就是连接服务端的过程
	 * 若服务端无响应，实例化过程会抛出异常
	 * 
	 * 端口号是一个整数，2字节内的整数0-65535
	 * 但3000以内的端口号不要使用，因为紧密的绑定
	 * 着系统程序，和世界上流程的应用程序。
	 * 10000以上以很少被使用
	 */
	public Client() throws Exception{
		try{
			socket = new Socket("127.0.0.1",8088);
		}catch(Exception e){
			//记录日志
			throw e;
		}
		
	}
	/*
	 * 客户端启动方法
	 */
	public void start(){
		try {
			Scanner sc = new Scanner(System.in);
			/*
			 * Socket提供方法：
			 * OutputStream getOutputStream()
			 * 通过获取的输出流写出的数据就可以通过网络发送
			 * 给远端计算机，对于客户端而言远端就是服务器
			 */
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
						
			PrintWriter pw = new PrintWriter(osw,true);
			//接受消息线程启动
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			System.out.println("请输入聊天内容：");
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
			 
			System.out.println("客户端启动失败，请检查网络连接。。");
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