package day04;
/**
 * �����ÿһ��ʵ�����ڱ�ʾֱ������ϵ��һ����
 * @author tarena
 *
 */
public class Point {
		
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * ͨ��һ�����toString��ʹ�ã����ToString��Ӧ������д
	 * toString���ص��ַ���û�и�ʽҪ�󣬰�ʵ�ʿ������������
	 * ԭ���Ϸ��ص��ַ�����Ӧ��������������������Ϣ��
	 * @return
	 */
	public String toString(){
		
		return "(" + x +"," + y +")";
	}
	/**
	 * ͨ��ʹ��һ�����equals������Ҫ��д��
	 * java Api�ṩ�����������д�ˡ������Լ��������Ҫ������д��
	 * equals�����������ǱȽ������������񡱣����������Ƿ�һ�¡�
	 */
	public boolean equals(Object obj){
		
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point) obj;
			return p.x==this.x && p.y==this.y;
		}
		return false;
	}
}


