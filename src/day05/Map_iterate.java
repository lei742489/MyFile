package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * 遍历Map有三种方式：
 * 1:遍历所有的Key
 * 2:遍历每一组键值对(Entry)
 * 3:遍历所有的value(相对不常用)
 * @author tarena
 *
 */
public class Map_iterate {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("语文",85);
		map.put("数学",75);
		map.put("英语",88);
		map.put("物理",93);
		map.put("化学",72);
		
		/*
		 * 遍历所有的key;
		 * Set<k> keySet()
		 * 将当前Map中所有的key以一个Set集合形式返回
		 * 所以遍历这个Set集合就等同于遍历了所有的key
		 */
		
		Set<String> keyset = map.keySet();
		
		for(String s : keyset){
			System.out.println(s);
		}
		/*
		 * 获取每一级键值对
		 * 在Map内部，每一组键值对是用Map肉类类Entry的实例表示（Entry是接口，不同的Map实现类都实现了Entry用
		 * 于表示一组键值对)
		 * Set<Entry> entrySet()
		 * 将当前Map中所有键值对(若干Entry实例)存入一个Set集合并返回。
		 */
		
		Set<Entry<String,Integer>> entryset = map.entrySet();
		
		for (Entry<String,Integer> e : entryset){
			String s = e.getKey();
			Integer i = e.getValue();
			System.out.println(s+":"+i);
		}
		
		/*
		 * 遍历所有value
		 * Collection<v> values()
		 * 将当前Map中所有的value存入一个集合后返回
		 */
		Collection<Integer> values = map.values();
		for(Integer i : values){
			System.out.println("values:"+i);
		}
	
	}
}
