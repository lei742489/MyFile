package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map称为查找表，以key-value对的形式存放放元素
 * 在Map中有一个要求，即：key不允许重复(equals判断)
 * 
 * 常用实现类:java.util.HashMap(散列表);
 * 			TreeMap 二叉树实现
 * @author tarena
 *
 */
public class Map_put_get_remove {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<String, Integer>();	
		
		map.put("语文", 85);
		map.put("数学", 95);
		map.put("英语", 82);
		map.put("物理", 89);
		map.put("化学", 90);
		System.out.println(map);
		
		
		//给重复的key，原key会被替换,并返回被替换的值，若给定的key不存在，则返回null;
		map.put("化学", 100);
		System.out.println(map);
		
		Integer i = map.put("英语", 96);
		System.out.println(i);
		System.out.println(map);
		
		Integer j = map.put("音乐", 56);
		System.out.println(j);
		System.out.println(map);
		
		
		/*
		 * V remove(K k)
		 * 根据给定的key将对应的这组键值对删除
		 * 返回值为对应的value
		 * 叵给定的key不存在则返回null
		 */
		
		map.remove("音乐");
		
		System.out.println(map);
		
		
		/*
		 * V get(K k)
		 * 获取给定的key所对应的value
		 * 若给定的key不存在，则返回null
		 */
		
		Integer d = map.get("语文");
		System.out.println("语文："+d);
		
	}

}
