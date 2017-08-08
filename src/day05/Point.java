package day05;

/**
 * 用于测试作为集合元素进行排序
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
	 * 实现Comparable接口后必须重写compareTo方法
	 * 该方法的作用是定义当前对象this与参数对象o之间比较大小的规则。
	 * 返回值不关注具体取值，只关注取值范围：
	 * 当返回值>0:当前对象this大于参数对象o(this>o)
	 * 当返回值<0:this<o
	 * 当返回值=0:this==0;
	 */
	public int compareTo(Point o) {
		int ol = this.x*this.x+this.y*this.y;
		int o2 = o.x*o.x+o.y*o.y;
		return ol-o2;
	}

}
