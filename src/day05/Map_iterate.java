package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * ����Map�����ַ�ʽ��
 * 1:�������е�Key
 * 2:����ÿһ���ֵ��(Entry)
 * 3:�������е�value(��Բ�����)
 * @author tarena
 *
 */
public class Map_iterate {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("����",85);
		map.put("��ѧ",75);
		map.put("Ӣ��",88);
		map.put("����",93);
		map.put("��ѧ",72);
		
		/*
		 * �������е�key;
		 * Set<k> keySet()
		 * ����ǰMap�����е�key��һ��Set������ʽ����
		 * ���Ա������Set���Ͼ͵�ͬ�ڱ��������е�key
		 */
		
		Set<String> keyset = map.keySet();
		
		for(String s : keyset){
			System.out.println(s);
		}
		/*
		 * ��ȡÿһ����ֵ��
		 * ��Map�ڲ���ÿһ���ֵ������Map������Entry��ʵ����ʾ��Entry�ǽӿڣ���ͬ��Mapʵ���඼ʵ����Entry��
		 * �ڱ�ʾһ���ֵ��)
		 * Set<Entry> entrySet()
		 * ����ǰMap�����м�ֵ��(����Entryʵ��)����һ��Set���ϲ����ء�
		 */
		
		Set<Entry<String,Integer>> entryset = map.entrySet();
		
		for (Entry<String,Integer> e : entryset){
			String s = e.getKey();
			Integer i = e.getValue();
			System.out.println(s+":"+i);
		}
		
		/*
		 * ��������value
		 * Collection<v> values()
		 * ����ǰMap�����е�value����һ�����Ϻ󷵻�
		 */
		Collection<Integer> values = map.values();
		for(Integer i : values){
			System.out.println("values:"+i);
		}
	
	}
}
