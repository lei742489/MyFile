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
 * 聊天室服务端
 * @author tarena
 *
 */
public class Server {
	/**
	 * 运行在服务端的ServerSocket主要负责两个工作：
	 * 1：向系统申请服务端口，客户端就是通过这个
	 * 	   端口与服务端应用程序建立连接的
	 * 2：监听服务端口，一旦客户端通过该端口尝试连接时
	 *   ServerSocket就会实例化一个Socket与该
	 *   客户端通讯。
	 * 
	 */
	private ServerSocket server;
	/*
	 * 存放所有客户端的输出流，用于广播消息
	 */
	private List<PrintWriter> allOut;
	public Server(){
		try {
			/*
			 * 实例化ServerSocket时需要指定服务端口，
			 * 客户端就是通过这个端口与服务端建立连接的。
			 * 
			 * 该端口不能与系统其它程序申请的端口冲突，否则会
			 * 抛出异常
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
			 * ServerSocket提供方法：
			 * Socket accept()
			 * 该方法是一个阻塞方法，调用后会一致等待客户端的连接，
			 * 一旦一个客户端通过ServerSocket申请的端口建立
			 * 连接，那么accept方法会返回一个Socket实例，通过
			 * 该Socket实例可以与建立连接的客户端进行通讯。
			 */
			while(true){
			System.out.println("等待客户端连接......");
			
			Socket socket = server.accept();
			System.out.println("一个客户端已连接.");
			//启动一个线程来处理该客户端交互
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
			System.out.println("服务端启动失败");
		}
	}
	/**
	 * 该 线程是用于处理与指定客户端的交互工作
	 * @author tarena
	 *
	 */
	private class ClientHandler implements Runnable{
		//当前线程通过这个Socket与指定客户端交互
		private Socket socket;
		private String host;		//客户端的地址信息
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			//通过Socket获取远端计算机地址信息
			InetAddress address = socket.getInetAddress();
			//获取iP地址的字符串形式
			host = address.getHostAddress();
			
			
		}


		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * Socket提供方法：
				 * InputStream getInputStyream()
				 * 通过获取的输入流读取的字节就是来自远端
				 * 发送过来的数据，对于服务端而言，远端指的
				 * 就是客户端.
				 */
				
				InputStream in  = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"utf-8");
				BufferedReader br = new BufferedReader(isr);
				/*
				 * 通过Socket获取输出流，用于将消息发送给客户端
				 * 
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
				pw = new PrintWriter(osw,true);
				//将该客户端的输出流存入共享集合
				synchronized (allOut) {
					allOut.add(pw);
				}
			
				
				String message = null;
				/*
				 * 使用br.readline读取客户端发送过来的
				 * 一行字符串时，该方法会处于阻塞状态，直到
				 * 客户端真实发送过来一行，这里才会返回
				 * 但是当客户端断开连接时，br.readLine
				 * 会根据客户端不同操作系统有不同的反馈。
				 * 当windows的客户端断开，br.readLine
				 * 方法会抛出异常。
				 * 当linux的客户端断开，br.readLine方法
				 * 会返回null。
				 */
				while((message=br.readLine())!=null){
					/*
					 * 将消息转发给所有客户端
					 * 
					 * 线程在遍历集合时的操作要与集合的
					 * 增删元素互斥
					 */
					
					synchronized (allOut) {
						for(PrintWriter p : allOut){
							p.write(host+"说:"+message);
						}
					}
					
				}
				
				
			} catch (Exception e) {
				
			}finally{
				//处理客户端断开连接后的操作
				//将该客户端的输出流从共享集合中移除
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
