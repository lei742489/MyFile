package day10;
/**
 * 
 * ��Ч����Сͬ����Χ�����ڱ�֤����ǰ����
 * ��߲���Ч��
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
			System.out.println(t1.getName()+":����ѡ�·�...");
			Thread.sleep(5000);
			
			synchronized(this){
			System.out.println(t1.getName()+":���ڻ��·�...");
			Thread.sleep(5000);
			}
			System.out.println(t1.getName()+":�����뿪...");
			
			
		} catch (InterruptedException e) {
		}
		
	}
	
}