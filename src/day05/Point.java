package day05;

/**
 * ���ڲ�����Ϊ����Ԫ�ؽ�������
 * 
 * @author tarena
 *
 */
public class Point implements Comparable<Point>{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	/*
	 * ʵ��Comparable�ӿں������дcompareTo����
	 * �÷����������Ƕ��嵱ǰ����this���������o֮��Ƚϴ�С�Ĺ���
	 * ����ֵ����ע����ȡֵ��ֻ��עȡֵ��Χ��
	 * ������ֵ>0:��ǰ����this���ڲ�������o(this>o)
	 * ������ֵ<0:this<o
	 * ������ֵ=0:this==0;
	 */
	public int compareTo(Point o) {
		int ol = this.x*this.x+this.y*this.y;
		int o2 = o.x*o.x+o.y*o.y;
		return ol-o2;
	}

}
