package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合
 * 集合用来存放一组元素，与数组功能相似
 * 集合提供了操作元素的相关方法
 * 集合常见的两个子接口：
 * Set:不可重复集，重复元素不能放入集合两次以上
 * List:可重复集
 * 元素是否重复是依靠元素自身equals比较的结果而定
 * @author tarena
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		
		/*
		 * boolean add(E e)
		 * 向当前集合中添加给定元素，若成功存入则返回true。
		 * 
		 */
		c.add("1234");
		c.add("324234234");
		c.add(234432);
		c.add(55442.3654);
		System.out.println(c);
		
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		
		int size = c.size();
		System.out.println("size:"+size);
		
		
		/*
		 * boolean isEmpty()
		 * size为0时，返回ture;
		 */
		boolean em = c.isEmpty();
		System.out.println("是否空集:"+em);
		
		
		
		/*
		 * void clear();
		 * 移除此列表中的所有元素。
		 */
		c.clear();
		System.out.println("集合已清空");
		
		System.out.println("size:"+c.size());
		
		System.out.println("isEmpty:"+c.isEmpty());
		
	}

}
