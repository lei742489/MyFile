package day10;
/**
 * 
 * 有效的缩小同步范围可以在保证并发前提下
 * 提高并发效率
 * @author tarena
 *
 */
public class SyncDemo2 {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		Thread t1 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		
		
		Thread t2 = new Thread(){
			public void run(){
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
		
		
	}

}
class Shop{
	
	public  void buy(){
		
	
		try {
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getName()+":正在选衣服...");
			Thread.sleep(5000);
			
			synchronized(this){
			System.out.println(t1.getName()+":正在换衣服...");
			Thread.sleep(5000);
			}
			System.out.println(t1.getName()+":结账离开...");
			
			
		} catch (InterruptedException e) {
		}
		
	}
	
}